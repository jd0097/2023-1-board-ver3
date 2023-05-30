package com.green.boardver3.model;

import lombok.Data;

@Data
public class BoardEntity {
    private int iuser;
    private String uid;
    private String upw;
    private String name;
    private String gender;
    private String addr;
    private String mainPic;
    private String createdAt;
    private String updatedAt;
}
