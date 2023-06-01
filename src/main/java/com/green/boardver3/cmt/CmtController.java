package com.green.boardver3.cmt;

import com.green.boardver3.board.model.BoardSelDto;
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
    @GetMapping("/iboard")
    public List<CmtVo> getCmt(@PathVariable int iboard ,@RequestParam (defaultValue = "5") int row ){
       CmtSelDto dto = new CmtSelDto();
        dto.setRow(row);
        return service.selCmt(dto);
    }
}
