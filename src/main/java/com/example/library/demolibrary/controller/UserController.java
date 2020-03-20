package com.example.library.demolibrary.controller;

import com.example.library.demolibrary.model.entity.Book;
import com.example.library.demolibrary.model.entity.User;
import com.example.library.demolibrary.service.UserResource;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

  private UserResource userResource;

  @Autowired
  public UserController(UserResource userResource) {
    this.userResource = userResource;
  }

  @ResponseStatus(code = HttpStatus.CREATED)
  @PostMapping(value = "/create")
  public ResponseEntity createUser(@RequestBody User user) {
    userResource.createUser(user);
    return ResponseEntity.ok().build();
  }

  @PutMapping(value = "/update")
  public ResponseEntity updateUser(@RequestBody User user) {
    userResource.createUser(user);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping(value = "/delete")
  public ResponseEntity deleteUser(@RequestParam Integer id) {
    userResource.deleteUser(id);
    return ResponseEntity.ok().build();
  }

  @GetMapping(value = "/get")
  public ResponseEntity getUser() {
    List<User> users = userResource.getUser();
    return ResponseEntity.ok(users);
  }
}
