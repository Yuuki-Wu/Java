package com.example.sbmpsqlite.contoller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.sbmpsqlite.entity.User;
import com.example.sbmpsqlite.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@CrossOrigin
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/Login")
    public Boolean getUser(@RequestParam String uid, String upd, String time){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .select("*")
                .eq("user_id",uid)
                .eq("user_password", upd);
        Integer count = Math.toIntExact(userService.count(queryWrapper));
        User user = new User();
        user.setUserLatestLoginTime(time);
        userService.update(user, queryWrapper);
        if(count > 0){
            return true;
        } else {
            return false;
        }
    }

    @GetMapping("/Register")
    public Boolean getInfo(@RequestParam String uid, String upd){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .select("*")
                .eq("user_id",uid);
        Integer count = Math.toIntExact(userService.count(queryWrapper));
        if(count > 0){
            return false;
        } else {
            User user = new User();
            user.setUserId(uid);
            user.setUserPassword(upd);
            Boolean state = userService.save(user);
            return state;
        }
    }

    @GetMapping("/count")
    public int getCount(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        int count = (int) userService.count(queryWrapper);
        return count;
    }

}