package com.example.mapper.service;

import com.example.mapper.exception.UserNotFoundException;
import com.example.mapper.mapper.UserMapper;
import com.example.mapper.model.dto.BaseResponse;
import com.example.mapper.model.dto.UserRequest;
import com.example.mapper.model.dto.UserResponse;
import com.example.mapper.repo.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public record UserServiceImpl(MessageRepository repository, UserMapper userMapper) implements UserService {
    @Override
    public BaseResponse<UserResponse> send(UserRequest request) {
        UserResponse userResponse = userMapper.toDTO(repository.findByUsername(request.username())
                .orElseThrow(()->new UserNotFoundException("User not found")));
        return new BaseResponse<>(userResponse);
    }

}
