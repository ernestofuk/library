package com.example.library.demolibrary.service;

import com.example.library.demolibrary.model.entity.Book;
import java.util.List;
import java.util.Map;

public interface BookResource {

  void createBook(Book book);

  void updateBook(Book book);

  void deleteBook(Integer id);

  List<Book> getBook(Map<String, String> allParams);
}
