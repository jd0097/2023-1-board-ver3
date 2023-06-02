package com.green.boardver3.utils;

import java.util.UUID;

public class FileUtils {
    //확장자 리턴하는 메소드
    public static String getExt(String fileNm) {// abcd.123.hhh.jpg

        int dotIdx = fileNm.lastIndexOf(".") + 1;
        String ext = fileNm.substring(dotIdx);
        return ext;
    }

    public static String getFileNm(String fileNm) {
        return fileNm.substring(0, fileNm.lastIndexOf("."));
    }

    public static String makeRandomFileNm(String fileNm) {
        return UUID.randomUUID().toString() + "." + getExt(fileNm);


    }


}
