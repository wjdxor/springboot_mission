package dev.jt.basicmission.repository;

import dev.jt.basicmission.entity.BoardEntity;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<BoardEntity, Long> {
}
