package com.kurdi.redis.services;

import com.kurdi.redis.models.User;

import java.util.List;

public interface UsersService {
    boolean save(User user);

    List<User> getAll();
}
