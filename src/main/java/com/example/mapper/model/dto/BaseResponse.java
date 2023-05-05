package com.example.mapper.model.dto;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private T response;

    public BaseResponse(T userResponse) {
        this.response = userResponse;
    }
}
