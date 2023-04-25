package com.tprdk.ecommerce.service;

import com.tprdk.ecommerce.entity.User;
import com.tprdk.ecommerce.entity.UserDto;
import com.tprdk.ecommerce.entity.UserMapper;
import com.tprdk.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserMapper userMapper = UserMapper.INSTANCE;
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto getUser(String username){
        Optional<User> user = this.userRepository.findByUsername(username);

        return user
                .map(userMapper.INSTANCE::entityToDTO)
                .orElseThrow(() -> new RuntimeException("User not exist."));
    }
}
