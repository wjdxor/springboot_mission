package dev.jt.crud.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardRestController {
    private static final Logger logger = LoggerFactory.getLogger(BoardRestController.class);
    private final BoardService boardService;

    public BoardRestController(
            @Autowired BoardService boardService
    ) {
        this.boardService = boardService;
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createBoard(@RequestBody BoardDto Dto){
        logger.info(Dto.toString());
        this.boardService.createBoard(Dto);
    }

    @GetMapping()
    public List<BoardDto> readBoardAll(){
        logger.info("in read board");
        return this.boardService.readBoardAll();
    }

    @GetMapping("{id}")
    public BoardDto readBoard(@PathVariable("id") int id){
        logger.info("in read board all");
        return this.boardService.readBoard(id);
    }

    @DeleteMapping("{board_id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteBoard(@PathVariable("id") int id) {
        this.boardService.deleteBoard(id);
    }
}
