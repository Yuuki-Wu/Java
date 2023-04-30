package com.example.sbmpsqlite.contoller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.sbmpsqlite.entity.MovementUpload;
import com.example.sbmpsqlite.mapper.MovementUploadMapper;
import com.example.sbmpsqlite.service.MovementUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/MovementUpload")
public class MovementUploadController {
    @Resource
    MovementUploadService movementUploadService;

    @Autowired
    MovementUploadMapper movementUploadMapper;
    @GetMapping("/upload")
    public Boolean upload(@RequestParam String uid, String name,String position,String img, String detail, String steps){
        String MovementType;
        String MovementPositionEn = UploadController.getString(position);
        MovementType = MovementPositionEn + "Item";
        MovementUpload movementUpload = new MovementUpload();
        movementUpload.setUserId(uid);
        movementUpload.setMovementName(name);
        movementUpload.setMovementPositionCn(position);
        movementUpload.setMovementImg(img);
        movementUpload.setMovementDetail(detail);
        movementUpload.setMovementSteps(steps);
        movementUpload.setIsSelected(0);
        movementUpload.setMovementPositionEn(MovementPositionEn);
        movementUpload.setMovementType(MovementType);

        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", uid);
        Boolean state = movementUploadService.saveOrUpdate(movementUpload, queryWrapper);
        return state;
    }

    @GetMapping("/getUpload")
    public List<MovementUpload> getList(@RequestParam String uid){
        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", uid);
        List<MovementUpload> list = movementUploadService.list(queryWrapper);
        return list;
    }
}
