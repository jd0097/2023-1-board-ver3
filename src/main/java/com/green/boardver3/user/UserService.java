package com.green.boardver3.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper mapper;

    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }
}
