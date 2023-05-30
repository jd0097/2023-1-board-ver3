package com.green.boardver3.model;

import lombok.Data;
@Data
public class BoardDto extends BoardEntity{
    public int uid;
    public String upw;
    public String name;
    public String gender;
    public String addr;
}
