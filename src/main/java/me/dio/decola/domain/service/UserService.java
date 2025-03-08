package me.dio.decola.domain.service;

import me.dio.decola.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
