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
            userInfo.setUserId(uid);
            userInfoService.save(userInfo);
        }

        List<UserInfo> list = userInfoService.list(queryWrapper);
        return list;
    }

    @GetMapping("/updateUserInfo")
    public Boolean updateUserInfo(@RequestParam String uid, String name, String img, Float height, Float weight){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(uid);
        userInfo.setName(name);
        userInfo.setImg(img);
        userInfo.setHeight(height);
        userInfo.setWeight(weight);

        Boolean state = userInfoService.saveOrUpdate(userInfo);
        return state;
    }

}
