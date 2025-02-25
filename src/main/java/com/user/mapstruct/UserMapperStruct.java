package com.user.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.user.dto.UserDataDTO;
import com.user.entity.UserData;

@Mapper(componentModel = "spring")
public interface UserMapperStruct {

	UserMapperStruct struct = Mappers.getMapper(UserMapperStruct.class);

	// Map DTO to Entity
	UserData toEntity(UserDataDTO dto);

	// Map Entity to DTO (optional if needed)
	UserDataDTO toDto(UserData entity);
}
