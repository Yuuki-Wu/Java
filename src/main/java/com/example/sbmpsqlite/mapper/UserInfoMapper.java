package com.example.sbmpsqlite.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sbmpsqlite.entity.UserInfo;
import com.github.yulichang.base.MPJBaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper extends MPJBaseMapper<UserInfo> {

}
