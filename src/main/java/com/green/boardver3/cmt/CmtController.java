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
    @PostMapping
    public int insCmt(@RequestBody CmtInsDto dto){
        return service.insCmt(dto);
    }
    @GetMapping("/{iboard}")
    public List<CmtVo> getCmt(@RequestParam ("iboard") int iboard
                             , @RequestParam ("page") int page
                             ,@RequestParam ("row") int row) {
        CmtVo vo = new CmtVo();
        CmtSelDto dto = new CmtSelDto();
        dto.setPage(page);
        dto.setRow(row);
        vo.setIboard(iboard);
        return service.selCmt(dto);
    }
}
