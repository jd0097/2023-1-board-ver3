package com.green.boardver3.board;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    public int insBoard(BoardEntity entity);
}
