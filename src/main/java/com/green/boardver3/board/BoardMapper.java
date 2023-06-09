package com.green.boardver3.board;

import com.green.boardver3.board.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVo> selBoard(BoardSelDto dto);
    BoardDetailVo selBoardDetail(BoardSelDto dto);

    int selBoardRowCount();
    int insBoard(BoardEntity dto);
    int updBoard(BoardUpdDto dto);
    int delBoard(BoardDelDto dto);

    int selBoardCmtRowCountByIBoard(int iboard);

}
