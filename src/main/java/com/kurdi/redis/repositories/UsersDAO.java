package com.kurdi.redis.repositories;

import com.kurdi.redis.models.User;

import java.util.List;

public interface UsersDAO {
    boolean save(User user);

    List<User> getAll();
}
