package com.example.sbmpsqlite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sbmpsqlite.entity.Movement;
import com.example.sbmpsqlite.mapper.MovementMapper;
import com.example.sbmpsqlite.service.MovementService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(rollbackFor = Exception.class)
public class MovementServiceImpl extends ServiceImpl<MovementMapper, Movement> implements MovementService {

}