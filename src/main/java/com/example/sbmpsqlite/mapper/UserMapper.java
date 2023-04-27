package com.example.sbmpsqlite.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sbmpsqlite.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {
}
