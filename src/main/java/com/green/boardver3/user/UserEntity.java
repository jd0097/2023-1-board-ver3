package com.green.boardver3.user;

import lombok.Data;

@Data
public class UserEntity {
    public int iuser;
    public String uid;
    public String upw;
    public String nm;
    public String gender;
    public String addr;
    public String mainPic;
    public String createdAt;
    public String updatedAt;
}
