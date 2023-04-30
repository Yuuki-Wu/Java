package com.example.sbmpsqlite.contoller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.sbmpsqlite.entity.User;
import com.example.sbmpsqlite.entity.UserContact;
import com.example.sbmpsqlite.service.UserContactService;
import com.example.sbmpsqlite.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/uploadInfo")
public class UserContactController {

    @Resource
    UserContactService userContactService;

    @GetMapping("/info")
    public Boolean upload(@RequestParam String uid, @RequestParam String time, @RequestParam String info){
        UserContact userContact = new UserContact();
        userContact.setUserId(uid);
        userContact.setUploadTime(time);
        userContact.setInfo(info);
        Boolean state = userContactService.save(userContact);
        return state;
    }

    @GetMapping("/getInfo")
    public List<UserContact> getInfo(){
        List<UserContact> list = userContactService.list();
        return list;
    }

    @GetMapping("/count")
    public int getCount(){
        QueryWrapper<UserContact> queryWrapper = new QueryWrapper<>();
        int count = (int) userContactService.count(queryWrapper.eq("state",0));
        return count;
    }
}
