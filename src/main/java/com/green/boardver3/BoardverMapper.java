package com.green.boardver3;

import com.green.boardver3.model.BoardEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardverMapper {
    int insBoard(BoardEntity entity);
}
