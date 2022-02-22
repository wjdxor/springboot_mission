package dev.jt.crud.board;

import dev.jt.crud.post.PostDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardRepositoryInMemory implements BoardRepository{
    private static final Logger logger = LoggerFactory.getLogger(BoardRepositoryInMemory.class);
    private final List<BoardDto> boardList;

    public BoardRepositoryInMemory() {
        this.boardList = new ArrayList<>();
    }


    @Override
    public BoardDto findById(int id) {
        return this.boardList.get(id);
    }

    @Override
    public boolean save(BoardDto dto) {
        return this.boardList.add(dto);
    }

    @Override
    public boolean delete(int id) {
        this.boardList.remove(id);
        return true;
    }

    @Override
    public boolean update(int id, BoardDto dto) {
        BoardDto targetPost = this.boardList.get(id);
        if(dto.getTitle() != null){
            targetPost.setTitle(dto.getTitle());
        }
        this.boardList.set(id, targetPost);
        return true;
    }

    @Override
    public List<BoardDto> findAll() {
        return this.boardList;
    }
}
