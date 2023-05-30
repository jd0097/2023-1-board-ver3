package com.green.boardver3.board;

import com.green.boardver3.board.model.BoardInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    public int insBoard(BoardInsDto dto);
}
