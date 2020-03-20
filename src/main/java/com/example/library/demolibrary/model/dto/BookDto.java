package com.example.library.demolibrary.model.dto;

public class BookDto {

  private String author;

  private String subject;

  private String isbn;

  public BookDto() {
  }

  public BookDto(String author, String subject, String isbn) {
    this.author = author;
    this.subject = subject;
    this.isbn = isbn;
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
}
