package com.ecommerce.marketplace.Service.Implementation;

import com.ecommerce.marketplace.DTO.UserDTO;
import com.ecommerce.marketplace.Entity.User;
import com.ecommerce.marketplace.Repository.UserRepository;
import com.ecommerce.marketplace.Service.IUserService;
import com.ecommerce.marketplace.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public UserDTO createUser(UserDTO user) {
        return null;
    }

    @Override
    public List<UserDTO> findAll() {
        List<User> users = userRepository.findAll();
        log.info("hit the service function");
        return userMapper.usersToUserDtos(users);
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
