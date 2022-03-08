package dev.jt.basicmission.repository;

import dev.jt.basicmission.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
}