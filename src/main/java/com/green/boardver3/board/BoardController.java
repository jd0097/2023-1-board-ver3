package com.green.boardver3.board;

import com.green.boardver3.board.model.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
@Tag(name="게시판", description = "")
public class BoardController {

    private final BoardService service;

    @Autowired
    public BoardController(BoardService service) {
        this.service = service;
    }

    @PostMapping
    public int postBoard(@RequestBody BoardInsDto dto) {
        return service.insBoard(dto);
    }

    @GetMapping
    public List<BoardVo> getBoard(@RequestParam(defaultValue = "1") int page
            , @RequestParam(defaultValue = "30") int row) {
        BoardSelDto dto = new BoardSelDto();
        dto.setPage(page);
        dto.setRow(row);
        return service.selBoard(dto);
    }

    @GetMapping("/maxpage")
    public int getBoardMaxPage(@RequestParam int row) {
        return service.selBoardMaxPage(row);
    }

    @GetMapping("/{iboard}")
    public BoardDetailDto getBoardDetail(@PathVariable int iboard){
        BoardDetailDto dto = new BoardDetailDto();
        dto.setIboard(iboard);
        return service.selbyBoard(dto);

    }
    @DeleteMapping
    public int delBoard(@RequestParam("iboard") int iboard,@RequestParam("iuser") int iuser){
        BoardDelDto dto = new BoardDelDto();
        dto.setIboard(iboard);
        dto.setIuser(iuser);
        return service.delBoard(dto);
    }
    @PutMapping
    public int putBoard(@RequestBody BoardUpdDto dto){
    return service.updBoard(dto);
    }

}
