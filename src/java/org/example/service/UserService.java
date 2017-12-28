package org.example.service;

import org.example.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserService extends CrudRepository<User, Integer> {
}
