package com.example.coco.service;

import com.example.coco.dto.UserDto;
import com.example.coco.model.User;
import com.example.coco.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserDto> getUserList() {
        final var res = userRepository.selectAll();
        return res.stream().map(user -> new UserDto(user.getId(), user.getName())).collect(Collectors.toList());
    }
}
