package com.example.springboottoy.repository;

import com.example.springboottoy.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    List<User> findByName(String name);
}
