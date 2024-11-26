package com.example.blogging.services;

import com.example.blogging.entity.User;
import com.example.blogging.payloads.UserDTO;

import java.util.List;

public class UserServiceImpl {


    public UserDTO createUser(UserDTO user) {
        return null;
    }
    public UserDTO getUser(Integer userid) {
        return null;
    }
    public UserDTO updateUser(Integer userid, UserDTO user) {
        return null;
    }
    public List<UserDTO> getAllUsers() {
        return null;
    }
    public void deleteUser(Integer userid) {
    }
    private User DTOtoUser(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setAbout(userDTO.getAbout());
        return user;
    }
    private UserDTO UserToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setAbout(user.getAbout());
        return userDTO;
    }

}
