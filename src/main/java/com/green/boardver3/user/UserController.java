package com.green.boardver3.user;

import io.swagger.v3.oas.annotations.Operation;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;
    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }


    @PostMapping
    @Operation(summary = "회원가입", description = "" +
            "uid: [20] 회원 아이디, <br>" +
            "upw : [100] 회원 비밀번호,<br>" +
            "nm : [30] 회원명,<br>" +
            "gender: [1] 성별(M: 남성, F:여성),<br>"+
            "addr: [100] 대구시 달서구")
    public int postUser(@RequestBody UserEntity entity) {
        return service.insUser(entity);
    }
    @PostMapping("/login")
    @Operation(summary = "로그인", description = "" )
    public int postLoginUser(@RequestBody UserLoginDto dto){
        return service.login(dto);
    }
}
