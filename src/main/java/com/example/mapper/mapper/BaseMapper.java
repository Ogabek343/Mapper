package com.example.mapper.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Named;

import java.util.List;

public interface BaseMapper<DTO , ENTITY> {
    @Named("toDTO")
    DTO toDTO(ENTITY entity);

    @IterableMapping(qualifiedByName = "")
    List<DTO> toListOfDTO(List<ENTITY> entity);

    @Named("toEntity")
    ENTITY toEntity(DTO dto);

    @IterableMapping(qualifiedByName = "")
    List<ENTITY> toListOfEntity(List<DTO> dto);

}
