package com.example.sbmpsqlite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sbmpsqlite.entity.MovementUpload;
import com.example.sbmpsqlite.mapper.MovementUploadMapper;
import com.example.sbmpsqlite.service.MovementUploadService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class MovementUploadServiceImpl extends ServiceImpl<MovementUploadMapper, MovementUpload> implements MovementUploadService {
}
