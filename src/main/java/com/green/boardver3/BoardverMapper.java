package com.green.boardver3;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardverMapper {
    int insBoard(BoardDto dto);
}
