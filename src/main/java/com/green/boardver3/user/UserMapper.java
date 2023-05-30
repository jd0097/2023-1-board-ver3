package com.green.boardver3.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserEntity entity);
    int Login(UserLoginDto dto);
    int idFail(UserLoginDto dto);
    int upwFail(UserLoginDto dto);
}
