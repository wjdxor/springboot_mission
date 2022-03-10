package dev.jt.basicmission.repository;

import dev.jt.basicmission.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
}