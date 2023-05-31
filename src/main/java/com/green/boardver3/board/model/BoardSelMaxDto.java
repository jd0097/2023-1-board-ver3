package com.green.boardver3.board.model;


import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class BoardSelMaxDto {
    private int iboard;
    private String title;
    private String ctnt;
    private int iuser;
    private String createdAt;
    private String updatedAt;
}