package com.green.boardver3.user;

import com.green.boardver3.user.model.UserEntity;
import com.green.boardver3.user.model.UserLoginDto;
import com.green.boardver3.user.model.UserLoginVo;
import com.green.boardver3.user.model.UserPatchPwDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserEntity entity);
    UserLoginVo selUserByUid(UserLoginDto dto);
    int updUserByUpw(UserPatchPwDto dto);
}
