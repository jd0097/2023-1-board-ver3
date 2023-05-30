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
        String hashPw = commonUtils.encodeSha256(entity.getUpw());
        entity.setUpw(hashPw);
        return mapper.insUser(entity);
    }
}
