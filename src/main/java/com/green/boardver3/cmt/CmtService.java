package com.green.boardver3.cmt;

import com.green.boardver3.cmt.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmtService {
    private final CmtMapper mapper;


    @Autowired
    public CmtService(CmtMapper mapper) {
        this.mapper = mapper;
    }

    public int insCmt(CmtEntity entity) {
        try {
            int result = mapper.insCmt(entity);
            if (result == 1) {
                return entity.getIboardCmt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<CmtVo> selCmt(CmtSelDto dto) {
        int startIdx = (dto.getPage() - 1) * dto.getRow();
        dto.setStartIdx(startIdx);
        return mapper.selCmt(dto);
    }

    public int delCmt(CmtEntity entity) {
        return mapper.delCmt(entity);
    }

    public int upCmt(CmtEntity entity){
        return mapper.upCmt(entity);
    }

}
