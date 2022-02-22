package dev.jt.crud.post;

import java.util.List;

public interface PostRepository {
    List<PostDto> findAll();
    PostDto finadById(int id);
    boolean save(PostDto dto);
    boolean delete(int id);
    boolean update(int id, PostDto dto);

}
