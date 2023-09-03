package com.josepillado.arquitecturasmodernas.microservices.user.service;

import com.josepillado.arquitecturasmodernas.microservices.user.model.User;
import com.josepillado.arquitecturasmodernas.microservices.user.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public Optional<User> findById(Long userId) {
    return userRepository.findById(userId);
  }

  public List<User> findAll() {
    return userRepository.findAll();
  }
}
