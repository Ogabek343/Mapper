package com.example.mapper.service;

import com.example.mapper.dto.MessageRequest;
import com.example.mapper.dto.MessageResponse;
import com.example.mapper.mapper.MessageMapper;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImp implements MessageService {

    @Override
    public MessageResponse send(MessageRequest request) {
        return MessageMapper.INSTANCE.convert(request);
    }
}
