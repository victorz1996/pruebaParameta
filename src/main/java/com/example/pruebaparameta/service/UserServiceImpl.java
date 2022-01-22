package com.example.pruebaparameta.service;

import com.example.pruebaparameta.entity.User;
import com.example.pruebaparameta.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    @Override
    public User createUser(User user) {
        User userDB = userRepository.findByNumeroDocumento(user.getNumeroDocumento());
        if(userDB != null){
            return null;
        }
        return userRepository.save(user);
    }
}
