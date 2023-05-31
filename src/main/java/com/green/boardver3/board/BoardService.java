package com.green.boardver3.board;

import com.green.boardver3.board.model.BoardDto;
import com.green.boardver3.board.model.BoardEntity;
import com.green.boardver3.board.model.BoardInsDto;
import com.green.boardver3.board.model.BoardVo;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper mapper;
@Autowired
@Builder
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
    public int selMaxBoard(BoardDto dto){

    return mapper.selMaxBoard(dto);
    }

}
