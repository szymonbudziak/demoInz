package com.example.demo.domain;

import com.example.demo.databaseUtils.entity.User;
import com.example.demo.databaseUtils.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.NoSuchElementException;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByNickname(s).orElseThrow(NoSuchElementException::new);
        return new org.springframework.security.core.userdetails.User(user.getNickname(), user.getPassword(), Collections.emptyList());
    }
}
