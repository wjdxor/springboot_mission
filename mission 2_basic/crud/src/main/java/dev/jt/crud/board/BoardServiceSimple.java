package dev.jt.crud.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceSimple implements BoardService{
    private static final Logger logger = LoggerFactory.getLogger(BoardServiceSimple.class);
    private final BoardRepository boardRepository;

    public BoardServiceSimple(
            @Autowired BoardRepository postRepository
    ) {
        this.boardRepository = postRepository;
    }


    @Override
    public BoardDto readBoard(int id) {
        return this.boardRepository.findById(id);
    }

    @Override
    public List<BoardDto> readBoardAll() {
        return this.boardRepository.findAll();
    }

    @Override
    public void createBoard(BoardDto dto) {
        // TODO
        if(!this.boardRepository.save(dto)) {
            throw new RuntimeException("save failed");
        }
    }

    @Override
    public void deleteBoard(int id) {
        this.boardRepository.delete(id);
    }
}
