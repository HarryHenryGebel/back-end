package com.lambdaschool.notapotluck.services;

import com.lambdaschool.notapotluck.models.User;

import java.util.List;

public interface UserService
{
    List<User> findAll();

    User findUserById(long id);

    User save(User user);
}
