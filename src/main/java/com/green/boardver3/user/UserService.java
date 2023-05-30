package com.green.boardver3.user;

import com.green.boardver3.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper mapper;
    private final CommonUtils commonUtils;
    @Autowired
    public UserService(UserMapper mapper, CommonUtils commonUtils) {
        this.mapper = mapper;
        this.commonUtils = commonUtils;
    }

    public int insUser(UserEntity entity) {
        //성별 항상 대문자 변경
        char gender = Character.toUpperCase(entity.getGender());
        entity.setGender(gender);
        //비밀번호 암호화
        String hashPw = commonUtils.encodeSha256(entity.getUpw());
        entity.setUpw(hashPw);
        try {
            return mapper.insUser(entity);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int login(UserLoginDto dto){
        UserLoginVo vo = mapper.selUserByUid(dto);
        if (vo == null) {
            return 2;
        } else if () {
            
        }
        return 0;
    }
}
