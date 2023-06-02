package com.green.boardver3.board.model;


import lombok.Data;

import java.util.List;

@Data
public class BoardSelDto {
    private int iboard;
    private int startIdx;
    private int page;
    private int row;
}
