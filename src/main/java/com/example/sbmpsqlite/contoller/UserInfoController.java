package com.example.sbmpsqlite.contoller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.sbmpsqlite.entity.UserInfo;
import com.example.sbmpsqlite.service.UserInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/userinfo")
public class UserInfoController {

    @Resource
    UserInfoService userInfoService;

    @GetMapping("/getUserInfo")
    public List<UserInfo> getUserInfo(@RequestParam String uid){
        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", uid);
        Integer count = Math.toIntExact(userInfoService.count(queryWrapper));
        if(count > 0){

        } else {
            UserInfo userInfo = new UserInfo();
            userInfo.setHeight((float) 0);
            userInfo.setWeight((float) 0);
            userInfo.setImg("_default");
            userInfo.setName("你好！健身人");
            userInfo.setUser_id(uid);
            userInfoService.save(userInfo);
        }

        List<UserInfo> list = userInfoService.list(queryWrapper);
        return list;
    }

}
