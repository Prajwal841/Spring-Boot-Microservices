package com.prajwal.springboot.service;

import java.util.List;

import com.prajwal.springboot.dto.UserDto;
import com.prajwal.springboot.entity.User;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
