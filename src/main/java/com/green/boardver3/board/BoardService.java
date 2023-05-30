package com.green.boardver3.board;

import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final BoardMapper mapper;

    public BoardService(BoardMapper mapper) {
        this.mapper = mapper;
    }
    public int insboard(BoardEntity entity){
        return mapper.insboard
    }
}
