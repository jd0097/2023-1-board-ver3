package com.green.boardver3.cmt;

import com.green.boardver3.cmt.model.CmtEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmtService {
     private final Mapper mapper;

     @Autowired
    public CmtService(Mapper mapper) {
        this.mapper = mapper;
    }

    public int insCmt(CmtEntity entity){
        return mapper.insCmt(entity);
    }

}
