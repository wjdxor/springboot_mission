package dev.jt.crud.board;

import dev.jt.crud.board.BoardDto;

import java.util.List;

public interface BoardRepository {
    BoardDto findById(int id);
    boolean save(BoardDto dto);
    boolean delete(int id);
    boolean update(int id, BoardDto dto);
    List<BoardDto> findAll();
}
