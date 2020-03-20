package com.example.library.demolibrary.service.impl;

import com.example.library.demolibrary.model.entity.Book;
import com.example.library.demolibrary.model.entity.User;
import com.example.library.demolibrary.repository.BookRepository;
import com.example.library.demolibrary.repository.UserRepository;
import com.example.library.demolibrary.service.UserResource;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserResource {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void createUser(User user) {
    userRepository.save(user);
  }

  @Override
  public void updateUser(User user) {
    userRepository.save(user);
  }

  @Override
  public void deleteUser(Integer id) {
    User user = new User(id);
    userRepository.save(user);
  }

  @Override
  public List<User> getUser() {
    return userRepository.findAll();
  }
}
