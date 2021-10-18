package com.kurdi.redis.services;

import com.kurdi.redis.models.User;
import com.kurdi.redis.repositories.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UsersService {

    @Autowired
    private UsersDAO usersDAO;
    @Override
    public boolean save(User user) {
        return usersDAO.save(user);
    }

    @Override
    public List<User> getAll() {
        return usersDAO.getAll();
    }
}
