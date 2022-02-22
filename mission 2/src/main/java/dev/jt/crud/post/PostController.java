package dev.jt.crud.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
@ResponseBody //클래스 안의 모든 함수들에 붙어있는 효과
//@RequestMapping("post") // 모두 Post값이 붙는다
public class PostController {
    private static Logger logger = LoggerFactory.getLogger(PostController.class);
//    private final List<PostDto> postList;
    private final PostService postService;

    public PostController(
            @Autowired PostService postService
    ) {
//        postList = new ArrayList<>();
        this.postService = postService;
    }

    @PostMapping("create")
    public void createPost(@RequestBody PostDto postDto) {
        logger.info(postDto.toString());
        this.postService.createPost(postDto);
    }

    @GetMapping("read-all")
    public List<PostDto> readPostAll() {
        logger.info("in read all");
        return this.postService.readPostAll();
    }

    @GetMapping("read-one")
    public PostDto readPostOne(@RequestParam("id") int id) {
        logger.info("in read one");
        return this.postService.readPost(id);
    }

    @PostMapping("update")
    public void updatePost(
            @RequestParam("id") int id, //URL에서 쿼리 파라미터를 말한다.
            @RequestBody PostDto postDto //Post요청의 body
    ) {
        this.postService.updatePost(id, postDto);
    }

    @DeleteMapping("delete")
    public void deletePost(@RequestParam("id")int id){
        this.postService.deletePost(id);
    }

}
