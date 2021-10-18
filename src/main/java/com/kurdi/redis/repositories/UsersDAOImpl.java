package com.kurdi.redis.repositories;

import com.kurdi.redis.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersDAOImpl implements UsersDAO {

    @Autowired
    private RedisTemplate redisTemplate;
    private static final String KEY = "USER";
    @Override
    public boolean save(User user) {
        try {
            redisTemplate.opsForHash().put(KEY, user.getId(), user);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<User> getAll() {
        List<User> users = redisTemplate.opsForHash().values(KEY);
        return users;
    }
}
