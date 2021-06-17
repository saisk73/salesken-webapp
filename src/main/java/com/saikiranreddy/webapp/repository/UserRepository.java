package com.saikiranreddy.webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.saikiranreddy.webapp.model.User;
public interface UserRepository extends CrudRepository<User, Integer> {
    
}
