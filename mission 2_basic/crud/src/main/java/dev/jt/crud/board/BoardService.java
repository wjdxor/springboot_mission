package dev.jt.crud.board;

import java.util.List;

public interface BoardService {
    BoardDto readBoard(int id);
    List<BoardDto> readBoardAll();
    void createBoard(BoardDto dto);
    void deleteBoard(int id);

}
