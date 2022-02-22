package dev.jt.crud.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepositoryInMemory implements PostRepository{
    private static final Logger logger = LoggerFactory.getLogger(PostRepositoryInMemory.class);
    private final List<PostDto> postList;

    public PostRepositoryInMemory() {
        this.postList = new ArrayList<>();
    }

    @Override
    public List<PostDto> findAll() {
        return this.postList;
    }

    @Override
    public PostDto finadById(int id) {

        return this.postList.get(id);
    }

    @Override
    public boolean save(PostDto dto) {
        return this.postList.add(dto);
    }

    @Override
    public boolean delete(int id) {
        this.postList.remove(id);
        return true;
    }

    @Override
    public boolean update(int id, PostDto postDto) {
        PostDto targetPost = this.postList.get(id);
        if(postDto.getTitle() != null){
            targetPost.setTitle(postDto.getTitle());
        }
        if(postDto.getContent() != null){
            targetPost.setContent(postDto.getContent());
        }
        if(postDto.getWriter() != null){
            targetPost.setWriter(postDto.getWriter());
        }
        this.postList.set(id, targetPost);
        return true;
    }
}
