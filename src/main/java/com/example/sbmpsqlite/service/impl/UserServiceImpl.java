package com.example.sbmpsqlite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sbmpsqlite.entity.User;
import com.example.sbmpsqlite.mapper.UserMapper;
import com.example.sbmpsqlite.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}