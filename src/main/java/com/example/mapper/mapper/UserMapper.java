package com.example.mapper.mapper;

import com.example.mapper.entity.User;
import com.example.mapper.model.dto.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<UserResponse, User>{

    @Mapping(target = "username",source = "username")
    UserResponse toDTO(User user);


}
