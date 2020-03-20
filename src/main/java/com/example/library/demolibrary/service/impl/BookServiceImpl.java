package com.example.library.demolibrary.service.impl;

import com.example.library.demolibrary.model.dto.BookDto;
import com.example.library.demolibrary.model.entity.Book;
import com.example.library.demolibrary.repository.BookRepository;
import com.example.library.demolibrary.service.BookResource;
import com.example.library.demolibrary.specification.BookSpecification;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookResource {

  private BookRepository bookRepository;

  @Autowired
  BookServiceImpl(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public void createBook(Book book) {
    bookRepository.save(book);
  }

  @Override
  public void updateBook(Book book) {
    bookRepository.save(book);
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
