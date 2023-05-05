package com.example.mapper.mapper.impl;

import com.example.mapper.entity.User;
import com.example.mapper.mapper.UserMapper;
import com.example.mapper.model.dto.UserResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapperImp implements UserMapper {
    @Override
    public List<UserResponse> toListOfDTO(List<User> entity) {
        List<UserResponse> userResponses = new ArrayList<>();
        for (User user:entity){
            userResponses.add(UserResponse.builder()
                    .username(user.getUsername())
                    .password(user.getPassword())
                    .age(user.getAge())
                    .build());
        }
        return userResponses;
    }

    @Override
    public User toEntity(UserResponse userResponse) {
        return null;
    }

    @Override
    public List<User> toListOfEntity(List<UserResponse> dto) {
        return null;
    }

    @Override
    public UserResponse toDTO(User user) {
        return UserResponse.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .age(user.getAge())
                .build();
    }
}
