package com.example.sbmpsqlite.contoller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.sbmpsqlite.entity.Admin;
import com.example.sbmpsqlite.entity.User;
import com.example.sbmpsqlite.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping(path = "/admin")
public class AdminController {

    @Resource
    AdminService adminService;

    @GetMapping("/login")
    public Boolean login(@RequestParam String id, String password){
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .select("*")
                .eq("admin_id",id)
                .eq("admin_password", password);
        Integer count = Math.toIntExact(adminService.count(queryWrapper));
        Admin admin = new Admin();
        if(count > 0){
            return true;
        } else {
            return false;
        }
    }
}
