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

    public int insBoard(UserEntity entity) {
        return mapper.insBoard(entity);
    }
}
