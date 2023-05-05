package com.example.mapper.controller;

import com.example.mapper.dto.MessageRequest;
import com.example.mapper.dto.MessageResponse;
import com.example.mapper.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/message/v1")
public class MessageController {

    private final MessageService messageService;

    @PostMapping("/send")
    public ResponseEntity<MessageResponse> send(@RequestBody MessageRequest request){
        return ResponseEntity.ok().body(messageService.send(request));
    }
}
