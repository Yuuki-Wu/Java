package com.example.sbmpsqlite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sbmpsqlite.entity.Admin;
import com.example.sbmpsqlite.mapper.AdminMapper;
import com.example.sbmpsqlite.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
}
