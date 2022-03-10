package dev.jt.basicmission.dao;

import dev.jt.basicmission.dto.BoardDto;
import dev.jt.basicmission.entity.BoardEntity;
import dev.jt.basicmission.repository.BoardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import java.util.Iterator;
import java.util.Optional;
import org.springframework.web.server.ResponseStatusException;

@Repository
public class BoardDao {
    private static final Logger logger = LoggerFactory.getLogger(BoardDao.class);
    private final BoardRepository boardRepository;

    public BoardDao(@Autowired BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void createBoard(BoardDto dto){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setName(dto.getName());
        this.boardRepository.save(boardEntity);
    }

    public BoardEntity readBoard(int id){
        Optional<BoardEntity> boardEntity = this.boardRepository.findById((long) id);
        if (boardEntity.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return boardEntity.get();
    }

    public Iterator<BoardEntity> readBoardAll(){
        return this.boardRepository.findAll().iterator();
    }

    public void updatePost(int id, BoardDto dto){
        Optional<BoardEntity> targetEntity = this.boardRepository.findById((long) id);
        if (targetEntity.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        BoardEntity boardEntity = targetEntity.get();
        boardEntity.setName(dto.getName() == null
                ? boardEntity.getName() : dto.getName());
        this.boardRepository.save(boardEntity);
    }

    public void deleteBoard(int id){
        Optional<BoardEntity> targetEntity = this.boardRepository.findById((long) id);
        if (targetEntity.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.boardRepository.delete(targetEntity.get());
    }
}