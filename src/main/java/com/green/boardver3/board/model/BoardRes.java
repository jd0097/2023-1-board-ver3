package com.green.boardver3.board.model;


import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BoardRes {
    private int maxPage;
    private int row;
    private int isMore;
    private List<BoardVo> list;

}
