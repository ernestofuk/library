package com.example.library.demolibrary.service.impl;

import com.example.library.demolibrary.model.dto.BookDto;
import com.example.library.demolibrary.model.entity.Book;
import com.example.library.demolibrary.repository.BookRepository;
import com.example.library.demolibrary.service.BookResource;
import com.example.library.demolibrary.specification.BookSpecification;
import com.example.library.demolibrary.util.Util;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookResource {

  private BookRepository bookRepository;

  private Util util;

  @Autowired
  BookServiceImpl(BookRepository bookRepository,Util util) {
    this.bookRepository = bookRepository;
    this.util = util;
  }

  @Override
  public void createBook(Book book) {
    if(util.validateBook(book)){
      bookRepository.save(book);
    }
  }

  @Override
  public void updateBook(Book book) {
    if(util.validateBook(book)) {
      bookRepository.save(book);
    }
  }

  @Override
  public void deleteBook(Integer id) {
    Book book = new Book(id);
    bookRepository.delete(book);
  }

  @Override
  public List<Book> getBook(Map<String, String> allParams) {
    BookDto bookDto = new BookDto();
    if (Objects.nonNull(allParams.get("author"))) {
      bookDto.setAuthor(allParams.get("author"));
    }
    if (Objects.nonNull(allParams.get("subject"))) {
      bookDto.setSubject(allParams.get("subject"));
    }
    if (Objects.nonNull(allParams.get("isbn"))) {
      bookDto.setIsbn(allParams.get("isbn"));
    }

    Specification<Book> specification = new BookSpecification(bookDto);
    return bookRepository.findAll(specification);
  }
}
