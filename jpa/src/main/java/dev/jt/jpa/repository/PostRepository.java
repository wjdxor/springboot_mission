package dev.hsooovn.jpa.repository;

import dev.hsooovn.jpa.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
}
