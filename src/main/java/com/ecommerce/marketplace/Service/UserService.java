package com.ecommerce.marketplace.Service;

import com.ecommerce.marketplace.DTO.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService implements UserServiceInterface {

    @Override
    public UserDTO createUser(UserDTO user) {
        return null;
    }

    @Override
    public List<UserDTO> findAll() {
        return null;
    }

    @Override
    public UserDTO getUserById(String id) {
        return null;
    }

    @Override
    public UserDTO updateUserById(UserDTO user) {
        return null;
    }

    @Override
    public UserDTO enableDisableUser(UserDTO user) {
        return null;
    }

    @Override
    public void deleteUser(String id) {

    }

    @Override
    public void sendResetPassword() {

    }

    @Override
    public void updateUserCredentials(UserDTO user) {

    }

    @Override
    public UserDTO getMe() {
        return null;
    }

    @Override
    public void resetPassword() {

    }
}
