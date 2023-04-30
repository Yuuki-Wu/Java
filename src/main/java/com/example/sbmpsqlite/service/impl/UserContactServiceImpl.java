package com.example.sbmpsqlite.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sbmpsqlite.entity.UserContact;
import com.example.sbmpsqlite.mapper.UserContactMapper;
import com.example.sbmpsqlite.service.UserContactService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserContactServiceImpl extends ServiceImpl<UserContactMapper, UserContact> implements UserContactService {
}
