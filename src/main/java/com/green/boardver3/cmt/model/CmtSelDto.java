package com.green.boardver3.cmt.model;

import lombok.Data;

@Data
public class CmtSelDto {
    private int iboardcmt;
    private int iboard;
    private int iuser;
    private String ctnt;
    private String writer;
    private String writerMainPic;
    private String createAt;
}
