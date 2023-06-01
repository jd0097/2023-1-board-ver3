package com.green.boardver3.cmt;

import com.green.boardver3.cmt.model.CmtEntity;
import com.green.boardver3.cmt.model.CmtInsDto;
import com.green.boardver3.cmt.model.CmtSelDto;
import com.green.boardver3.cmt.model.CmtVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmtService {
     private final CmtMapper mapper;
     private final int ROW = 5;
     @Autowired
    public CmtService(CmtMapper mapper) {
        this.mapper = mapper;
    }

    public int insCmt(CmtInsDto dto){

        //entity.setIboard(dto.getIboard());
         entity.setIuser(dto.getIuser());
         entity.setCtnt(dto.getCtnt());
         try{
             int result = mapper.insCmt(entity);
             if (result == 1) {
                 return entity.getIboardCmt();
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
        return 0;
    }

    public List<CmtVo> selCmt(CmtSelDto dto){
         dto.setRow(ROW);
        int startIdx = (dto.getPage() - 1) * dto.getRow();
        dto.setStartIdx(startIdx);
        return mapper.selCmt(dto);
    }



}
