package com.example.library.demolibrary.service;

import com.example.library.demolibrary.model.entity.Book;

public interface LibraryService {

  Integer createBook(Book book);

  Integer updateBook(Book book);
}
