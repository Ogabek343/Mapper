package com.example.mapper.controller;

import com.example.mapper.model.dto.BaseResponse;
import com.example.mapper.model.dto.UserRequest;
import com.example.mapper.model.dto.UserResponse;
import com.example.mapper.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.mapper.model.constants.Paths.BASE_API_PATH;


@RestController
@RequestMapping(BASE_API_PATH+"/message")
public record UserController(UserService service) {

    @PostMapping("/send")
    public ResponseEntity<BaseResponse<UserResponse>> send(UserRequest request){
        return ResponseEntity.ok().body(service.send(request));
    }

}
