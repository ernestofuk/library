package com.example.library.demolibrary.controller;

import com.example.library.demolibrary.model.entity.IssuedBook;
import com.example.library.demolibrary.service.IssuedBookResource;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssuedBookController {

  private IssuedBookResource issuedBookResource;

  @Autowired
  public IssuedBookController(IssuedBookResource issuedBookResource) {
    this.issuedBookResource = issuedBookResource;
  }

  @PostMapping(value = "/")
  public ResponseEntity createIssued(IssuedBook issuedBook) {
    issuedBookResource.createIssued(issuedBook);
    return ResponseEntity.ok().build();
  }
}
