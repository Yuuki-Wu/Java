package com.example.sbmpsqlite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sbmpsqlite.entity.Search;
import com.example.sbmpsqlite.mapper.SearchMapper;
import com.example.sbmpsqlite.service.SearchService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(rollbackFor = Exception.class)
public class SearchServiceImpl extends ServiceImpl<SearchMapper, Search> implements SearchService {

}