package com.tprdk.ecommerce.entity;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );
    UserDto entityToDTO(User user);
    User dtoToEntity(UserDto project);
}
