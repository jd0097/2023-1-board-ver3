package com.green.boardver3.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper mapper;
    @Autowired
    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }

    public int insUser(UserEntity entity) {
        return mapper.insUser(entity);
    }
}
