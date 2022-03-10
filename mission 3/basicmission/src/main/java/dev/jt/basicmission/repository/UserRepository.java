package dev.jt.basicmission.repository;

import dev.jt.basicmission.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}