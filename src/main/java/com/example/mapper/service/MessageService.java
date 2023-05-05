package com.example.mapper.service;


import com.example.mapper.dto.MessageRequest;
import com.example.mapper.dto.MessageResponse;

public interface MessageService {
    MessageResponse send(MessageRequest request);
}
