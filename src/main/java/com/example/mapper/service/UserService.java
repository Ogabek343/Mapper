package com.example.mapper.service;

import com.example.mapper.model.dto.BaseResponse;
import com.example.mapper.model.dto.UserRequest;
import com.example.mapper.model.dto.UserResponse;

public interface UserService {
    BaseResponse<UserResponse> send(UserRequest request);
}
