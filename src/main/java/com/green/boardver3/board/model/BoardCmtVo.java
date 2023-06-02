package com.green.boardver3.board.model;

import com.green.boardver3.cmt.model.CmtVo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class BoardCmtVo {
    private int iboard;
    private int maxPage;
    private int row;
    private int isMore; //0 댓글 더 없음, 1 댓글 더 있음
    private List<CmtVo> list;
}
