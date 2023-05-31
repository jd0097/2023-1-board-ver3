package com.green.boardver3.board;

import com.green.boardver3.board.model.*;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper mapper;
@Autowired

    public BoardService(BoardMapper mapper) {
        this.mapper = mapper;
    }

    public int insBoard(BoardInsDto dto){
        return mapper.insBoard(dto);
    }

    public List<BoardVo> selBoardAll(BoardDto dto){
    int startIdx = (dto.getPage() -1) * dto.getRowLen();
    dto.setRowLen(dto.getRowLen());
    dto.setStartIdx(startIdx);
    return mapper.selBoardAll(dto);
}
public int selMaxBoad(int row){
    int count = mapper.selMaxBoard(row);
    return  (int)Math.ceil((double)count/row);
}
public BoardSelDto selBoardById(BoardDto dto){

    return mapper.selBoardById(dto);
}



}
