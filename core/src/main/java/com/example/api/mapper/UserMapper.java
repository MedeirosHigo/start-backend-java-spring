package com.example.api.mapper;

import com.example.api.model.User;
import com.example.api.responseDTO.UserResponseDTO;
import org.mapstruct.Mapper;



import java.util.List;

@Mapper
public interface UserMapper {
    List<UserResponseDTO> toUserResponseDTO(List<User> users);

    User toUserEntity(UserResponseDTO userResponseDTO);
}
