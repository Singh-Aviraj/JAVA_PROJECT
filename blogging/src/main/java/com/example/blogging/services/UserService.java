package com.example.blogging.services;

import com.example.blogging.entity.User;
import com.example.blogging.payloads.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO user);
    UserDTO getUser(Integer userid);
    UserDTO updateUser(Integer userid, UserDTO user);
    List<UserDTO> getAllUsers();
    void deleteUser(Integer userid);
}
