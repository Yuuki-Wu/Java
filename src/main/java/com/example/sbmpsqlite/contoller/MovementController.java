package com.example.sbmpsqlite.contoller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.sbmpsqlite.entity.Movement;
import com.example.sbmpsqlite.service.MovementService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/movement")
public class MovementController {
    @Resource
    private MovementService movementService;

    @GetMapping("/getMovementList")
    @ResponseBody
    public List<Movement> getMovementList(){
        List<Movement> list = movementService.list();
        return list;
    }
    @GetMapping("/getListUser")
    @ResponseBody
    public Object getList(){
        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("movement_name","杠铃卧推");
        List<Movement> list = movementService.list(queryWrapper);
        return list;
    }

    @GetMapping("/getImg")
    public List<Movement> getImg(@RequestParam String img){
        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("movement_img",img);
        List<Movement> list = movementService.list(queryWrapper);
        return list;
    }
}
