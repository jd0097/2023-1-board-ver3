package com.green.boardver3.board;

import com.green.boardver3.board.model.*;
import com.green.boardver3.cmt.CmtMapper;
import com.green.boardver3.cmt.model.CmtEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper mapper;
    private final CmtMapper cmtMapper;

    @Autowired
    public BoardService(BoardMapper mapper, CmtMapper cmtMapper) {
        this.mapper = mapper;
        this.cmtMapper = cmtMapper;
    }

    public int insBoard(BoardInsDto dto) {
        BoardEntity entity = new BoardEntity();
        entity.setTitle(dto.getTitle());
        entity.setCtnt(dto.getCtnt());
        entity.setIuser(dto.getIuser());
        int result = mapper.insBoard(entity);
        if(result == 1) {
            return entity.getIboard();
        }
        return result;
    }

    public List<BoardVo> selBoard(BoardSelDto dto) {
        int startIdx = (dto.getPage() - 1) * dto.getRow();
        dto.setStartIdx(startIdx);
        return mapper.selBoard(dto);
    }

    public int selBoardMaxPage(int row) {
        int count = mapper.selBoardRowCount(row);
        return (int) Math.ceil((double) count / row);
    }

    public BoardDetailDto selbyBoard(BoardDetailDto dto) {
        return mapper.selbyBoard(dto);
    }
    public int delBoard(BoardDetailDto dto){
        CmtEntity entity = new CmtEntity();
        int result = cmtMapper.delCmt(entity);
        //그 글에 달려있는 댓글을 전부 삭제해야 함.
        return mapper.delBoard(dto);
    }
    public int updBoard(BoardUpdDto dto){
        return mapper.updBoard(dto);
    }
}
