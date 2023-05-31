package com.green.boardver3.board;

import com.green.boardver3.board.model.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final Logger LOGGER;
    private final BoardService service;

    @Autowired
    public BoardController(BoardService service) {
        LOGGER = LoggerFactory.getLogger(BoardController.class);
        this.service = service;
    }
    @PostMapping
    public int postBoard(BoardInsDto dto){
        return service.insBoard(dto);
    }

    @GetMapping
    public List<BoardVo> getBoard(@RequestParam (defaultValue = "1") int page,
                                  @RequestParam(defaultValue = "40")int row){
        LOGGER.info("page : "+ page);
        BoardDto dto = new BoardDto();
        dto.setPage(page);
        dto.setRowLen(row);

        return service.selBoardAll(dto);
    }
    @GetMapping("/maxpage")
    public int getBoardMax(@RequestParam int row ){

        return service.selMaxBoad(row);

    }



}
