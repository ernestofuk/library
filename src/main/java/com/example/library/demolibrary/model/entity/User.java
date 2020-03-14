package com.example.library.demolibrary.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  private Integer id;

  private String name;

  private Integer age;

  private String email;

  private String mobile;
}
