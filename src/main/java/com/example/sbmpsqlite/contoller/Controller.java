package com.example.sbmpsqlite.contoller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.sbmpsqlite.entity.Search;
import com.example.sbmpsqlite.entity.User;
import com.example.sbmpsqlite.mapper.SearchMapper;
import com.example.sbmpsqlite.service.SearchService;
import com.example.sbmpsqlite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping(path = "/user")
public class Controller {

    @Resource
    private UserService userService;

    @Resource
    private SearchService searchService;


    @Autowired
    SearchMapper searchMapper;
    /**
     * 查询全部
     * @return
     */

    @GetMapping("/getMovementList")
    @ResponseBody
    public List<User> getMovementList(){
        List<User> list = userService.list();
        return list;
    }
    @GetMapping("/getListUser")
    @ResponseBody
    public Object getList(){
        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("movement_name","杠铃卧推");
        List<User> list = userService.list(queryWrapper);
        return list;
    }

    @GetMapping("/searchList")
    public List<Search> getSearch(){
        List<Search>list = searchService.list();
        return list;
    }

    @GetMapping("/test")
    public List<Search> getL(@RequestParam String name){
        List<Search>list = searchService.listByIds(Collections.singleton(name));
        System.out.println(name);
        return list;
    }

}