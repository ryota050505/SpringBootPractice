package com.example.coco.repository;

import com.example.coco.entity.User;
import com.example.coco.entity.UserExample;
import com.example.coco.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final UserMapper userMapper;

    public List<User> selectAll() {
        final var userExample = new UserExample();
        return userMapper.selectByExample(userExample);
    }
}
