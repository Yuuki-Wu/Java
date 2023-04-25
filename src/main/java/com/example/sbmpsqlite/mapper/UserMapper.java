package com.example.sbmpsqlite.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sbmpsqlite.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<User> {

}