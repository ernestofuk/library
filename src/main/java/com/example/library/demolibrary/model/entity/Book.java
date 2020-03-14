package com.example.library.demolibrary.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

  @Id
  private Integer id;

  private String title;

  private String author;


}
