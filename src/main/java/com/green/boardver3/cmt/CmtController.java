package com.green.boardver3.cmt;

import com.green.boardver3.cmt.model.CmtEntity;
import com.green.boardver3.cmt.model.CmtInsDto;
import com.green.boardver3.cmt.model.CmtSelDto;
import com.green.boardver3.cmt.model.CmtVo;
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
    @PostMapping("/{iboard}")
    public int insCmt(@PathVariable int iboard
                    , @RequestBody CmtInsDto dto){
    CmtEntity entity = new CmtEntity();
    entity.setIboard(iboard);
    entity.setIuser(dto.getIuser());
    entity.setCtnt(dto.getCtnt());
        return service.insCmt(entity);
    }
    @GetMapping
    public List<CmtVo> getCmt( @RequestParam int page
                             ,@RequestParam (defaultValue = "5") int row) {
        CmtVo vo = new CmtVo();
        CmtSelDto dto = new CmtSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return service.selCmt(dto);
    }
}
