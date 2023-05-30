package com.green.boardver3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final BoardverMapper mapper;

    @Autowired
    public BoardService(BoardverMapper mapper) {
        this.mapper = mapper;
    }

    public int insBoard(BoardEntity entity) {
        return mapper.insBoard(entity);
    }
}
