package com.green.boardver3;

import com.green.boardver3.model.BoardDto;
import com.green.boardver3.model.BoardEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardverMapper {
    int insBoard(BoardDto dto);
}
