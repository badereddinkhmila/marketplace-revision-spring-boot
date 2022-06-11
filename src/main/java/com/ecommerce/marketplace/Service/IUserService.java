package com.ecommerce.marketplace.Service;

import com.ecommerce.marketplace.DTO.UserDTO;

import java.util.List;

public interface IUserService {
    UserDTO createUser(UserDTO user);
    List<UserDTO> findAll();
    UserDTO getUserById(String id);
    UserDTO updateUserById(UserDTO user);
    UserDTO enableDisableUser(UserDTO user);
    void deleteUser(String id);
    void sendResetPassword();
    void updateUserCredentials(UserDTO user);
    UserDTO getMe();
    void resetPassword();
}
