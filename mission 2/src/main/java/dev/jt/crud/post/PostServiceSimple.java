package dev.jt.crud.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceSimple implements PostService{
    private static final Logger logger = LoggerFactory.getLogger(PostServiceSimple.class);
    private final PostRepository postRepository; //구현과 상관없이 사용하기 위해 인터페이스를 사용한다.

    public PostServiceSimple(@Autowired PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void createPost(PostDto dto) {
        // TODO
        if(!this.postRepository.save(dto)){
            throw new RuntimeException("savs failed");
        }
    }

    @Override
    public List<PostDto> readPostAll() {
        return this.postRepository.findAll();
    }

    @Override
    public PostDto readPost(int id) {
        return this.postRepository.finadById(id);
    }

    @Override
    public void updatePost(int id, PostDto dto) {
        this.postRepository.update(id,dto);
    }

    @Override
    public void deletePost(int id) {
        this.postRepository.delete(id);
    }
}
