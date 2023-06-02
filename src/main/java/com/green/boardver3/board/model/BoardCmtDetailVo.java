package com.green.boardver3.board.model;

import com.green.boardver3.cmt.model.CmtSelDto;
import com.green.boardver3.cmt.model.CmtVo;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;
@Data
@Builder
public class BoardCmtDetailVo {
    private int iboard;
    private String title;
    private String ctnt;
    private String createdAt;
    private String writer;
    private String writerMainPic;
    private int maxPage;
    private int row;
    private int isMore;
    private List<CmtSelDto> list;
}
