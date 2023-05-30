package com.green.boardver3.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class BoardController {
    private final BoardService service;

    @Autowired
    public BoardController(BoardService service) {
        this.service = service;
    }
    @PostMapping
    public int postBoard(BoardEntity entity){
        return service.insBoard(entity);
    }
}
