package com.example.library.demolibrary.model.entity;

import java.util.List;
import java.util.spi.LocaleServiceProvider;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Book {

  @Id
  private Integer id;

  private String title;

  private String author;

  private String subject;

  private String isbn;

  @OneToMany(mappedBy = "book")
  private List<IssuedBook> issuedBook;

  public Book() {
  }

  public Book(Integer id) {
    this.id = id;
  }

  public Book(Integer id, String title, String author, String subject, String isbn,
      List<IssuedBook> issuedBook) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.subject = subject;
    this.isbn = isbn;
    this.issuedBook = issuedBook;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public List<IssuedBook> getIssuedBook() {
    return issuedBook;
  }

  public void setIssuedBook(
      List<IssuedBook> issuedBook) {
    this.issuedBook = issuedBook;
  }
}
