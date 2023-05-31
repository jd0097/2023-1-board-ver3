package com.green.boardver3.board;

import com.green.boardver3.board.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public int insBoard(BoardInsDto dto);
    List<BoardVo> selBoardAll(BoardDto dto);
    List<BoardVo> selMaxBoard(BoardSelMaxDto dto);
}
