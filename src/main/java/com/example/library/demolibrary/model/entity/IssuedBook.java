package com.example.library.demolibrary.model.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IssuedBook {

  @Id
  private Integer id;

  private User user;

  private Book book;

  private LocalDate date;
}
