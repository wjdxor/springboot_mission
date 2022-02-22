package dev.jt.crud.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("post")
public class PostRestControoler {
    private static final Logger logger = LoggerFactory.getLogger(PostRestControoler.class);
//    private final List<PostDto> postList;
    private final PostService postService;

    public PostRestControoler(
            @Autowired PostService postService
    ) {
        this.postService = postService;
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createPost(@RequestBody PostDto postDto){
        logger.info(postDto.toString());
        this.postService.createPost(postDto);
    }
    @GetMapping()
    public List<PostDto> reatPostAll() {
        logger.info("in read post all");
        return this.postService.readPostAll();
    }
    @GetMapping("{id}")
    public PostDto readPost(@PathVariable("id") int id){
        logger.info("in read post");
        return this.postService.readPost(id);
    }

    @PutMapping("{id}")
    public void updatePost(
            @PathVariable("id")int id,
            @RequestBody PostDto postDto
        ) {
            this.postService.updatePost(id, postDto);
        }
    @DeleteMapping("{id}")
    public void deletePost(@PathVariable("id")int id) {
        this.postService.deletePost(id);
        logger.info("delete");
    }
}
