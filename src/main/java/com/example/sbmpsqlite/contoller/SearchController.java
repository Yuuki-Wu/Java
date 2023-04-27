package com.example.sbmpsqlite.contoller;

import com.example.sbmpsqlite.entity.Search;
import com.example.sbmpsqlite.service.SearchService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/search")
public class SearchController {
    @Resource
    private SearchService searchService;
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
