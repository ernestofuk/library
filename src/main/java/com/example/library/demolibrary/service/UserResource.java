package com.example.library.demolibrary.service;

import com.example.library.demolibrary.model.entity.Book;
import com.example.library.demolibrary.model.entity.User;
import java.util.List;

public interface UserResource {

  void createUser(User user);

  void updateUser(User user);

  void deleteUser(Integer id);

  List<User> getUser();
}
