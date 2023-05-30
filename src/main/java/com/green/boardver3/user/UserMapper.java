package com.green.boardver3.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserEntity entity);
    UserLoginVo selUserByUid(UserLoginDto dto);
    int updUserByUpw(UserEntity entity);
}
