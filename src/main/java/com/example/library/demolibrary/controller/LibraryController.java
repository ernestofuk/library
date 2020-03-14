package com.example.library.demolibrary.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/library")
public class LibraryController {


  @PostMapping(value = "/book/create")
  public ResponseEntity createBook(){

    return ResponseEntity.ok().build();
  }
}
