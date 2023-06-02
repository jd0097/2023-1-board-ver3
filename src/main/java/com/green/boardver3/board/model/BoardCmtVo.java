package com.green.boardver3.board.model;

import com.green.boardver3.cmt.model.CmtRes;
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
    private String title;
    private String ctnt;
    private String createdAt;
    private String writer;
    private String writerMainPic;
    private CmtRes cmt;
}
