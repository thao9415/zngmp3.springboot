package com.codegym.zingmp3.repo;

import com.codegym.zingmp3.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    abstract public List<User> findByName(String name);
    abstract public List<User> findAll();

}
