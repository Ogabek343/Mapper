package com.example.mapper.mapper;

import com.example.mapper.dto.MessageRequest;
import com.example.mapper.dto.MessageResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MessageMapper {

    MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);
    @Mapping(target = "username",source = "username",ignore = true)
    MessageResponse convert(MessageRequest request);
}
