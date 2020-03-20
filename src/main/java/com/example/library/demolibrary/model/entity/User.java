package com.example.library.demolibrary.model.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

  @Id
  private Integer id;

  private String name;

  private Integer age;

  private String email;

  private String mobile;

  @OneToMany(mappedBy = "user")
  private List<IssuedBook> issuedBook;

  public User() {
  }

  public User(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public List<IssuedBook> getIssuedBook() {
    return issuedBook;
  }

  public void setIssuedBook(
      List<IssuedBook> issuedBook) {
    this.issuedBook = issuedBook;
  }
}
