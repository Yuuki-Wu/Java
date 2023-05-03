package com.example.sbmpsqlite.contoller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.sbmpsqlite.entity.User;
import com.example.sbmpsqlite.entity.UserContact;
import com.example.sbmpsqlite.entity.UserInfo;
import com.example.sbmpsqlite.entity.UserInfoJoin;
import com.example.sbmpsqlite.mapper.UserInfoMapper;
import com.example.sbmpsqlite.service.UserInfoService;
import com.github.yulichang.query.MPJQueryWrapper;
import com.github.yulichang.toolkit.JoinWrappers;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/userinfo")
public class UserInfoController {

    @Resource
    UserInfoService userInfoService;

    @Resource
    UserInfoMapper userInfoMapper;
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
            userInfo.setImg("_default.png");
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

    @GetMapping("/getUserAllInfo")
    public List getAll(){
        MPJLambdaWrapper<UserInfo> wrapper = JoinWrappers.lambda(UserInfo.class)
                .selectAll(UserInfo.class)
                .select(User::getUserRegisterTime)
                .select(UserContact::getState, UserContact::getInfo)
                .leftJoin(User.class, User::getUserId, UserInfo::getUserId)
                .rightJoin(UserContact.class, UserContact::getUserId, UserInfo::getUserId);
        List list = userInfoMapper.selectJoinList(UserInfoJoin.class, wrapper);
        return list;
    }
}
