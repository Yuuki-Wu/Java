package com.example.sbmpsqlite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sbmpsqlite.entity.TrainMovement;
import com.example.sbmpsqlite.mapper.TrainMovementMapper;
import com.example.sbmpsqlite.service.TrainMovementService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class TrainMovementServiceImpl extends ServiceImpl<TrainMovementMapper, TrainMovement> implements TrainMovementService {

}
