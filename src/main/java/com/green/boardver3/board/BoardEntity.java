package com.green.boardver3.board;

import lombok.Data;

@Data
public class BoardEntity {
    private int iboard;
    private String title;
    private String ctnt;
    private int iuser;
    private String createdAt;
    private String updatedAt;
}
