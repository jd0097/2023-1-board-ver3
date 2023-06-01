package com.green.boardver3.cmt;

import com.green.boardver3.cmt.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board/cmt")
public class CmtController {
    private final CmtService service;
@Autowired
    public CmtController(CmtService service) {
        this.service = service;
    }
    @PostMapping("/{iboard}/cmt")
    public int insCmt(@PathVariable int iboard
                    , @RequestBody CmtInsDto dto){
    CmtEntity entity = new CmtEntity();
    entity.setIboard(iboard);
    entity.setIuser(dto.getIuser());
    entity.setCtnt(dto.getCtnt());
        return service.insCmt(entity);
    }
    @GetMapping("/{iboard}/cmt")
    public List<CmtVo> getCmt(@PathVariable int iboard
                              ,@RequestParam int page
                             ,@RequestParam (defaultValue = "5") int row) {
        CmtSelDto dto = new CmtSelDto();
        dto.setPage(page);
        dto.setRow(row);
        dto.setIboard(iboard);
        return service.selCmt(dto);
    }

    @DeleteMapping("/cmt/{iboardCmt}")
    public int delCmt(@PathVariable int iboardCmt
                        , @RequestParam int iuser) {
        CmtEntity entity = new CmtEntity();
        entity.setIboardCmt(iboardCmt);
        entity.setIuser(iuser);
        return service.delCmt(entity);
    }
    @PutMapping("/{iboardCmt}")
    public int upCmt(@PathVariable int iboardCmt, @RequestBody CmtEntity entity){
    entity.setIboardCmt(iboardCmt);
    return service.upCmt(entity);
    }
}