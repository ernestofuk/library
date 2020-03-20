package com.example.library.demolibrary.controller;

import com.example.library.demolibrary.model.entity.Book;
import com.example.library.demolibrary.service.BookResource;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

  private BookResource bookService;

  @Autowired
  public BookController(BookResource bookService) {
    this.bookService = bookService;
  }

  @ResponseStatus(code = HttpStatus.CREATED)
  @PostMapping(value = "/book/create")
  public ResponseEntity createBook(@RequestBody Book book) {
    bookService.createBook(book);
    return ResponseEntity.ok().build();
  }

  @PutMapping(value = "/book/update")
  public ResponseEntity updateBook(@RequestBody Book book) {
    bookService.updateBook(book);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping(value = "/book/delete")
  public ResponseEntity deleteBook(@RequestParam Integer id) {
    bookService.deleteBook(id);
    return ResponseEntity.ok().build();
  }

  @GetMapping(value = "/book-search")
  public ResponseEntity getBook(@RequestParam Map<String, String> allParams) {
    List<Book> books = bookService.getBook(allParams);
    return ResponseEntity.ok().build();
  }
}
