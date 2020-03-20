package com.example.library.demolibrary.service.impl;

import com.example.library.demolibrary.model.entity.IssuedBook;
import com.example.library.demolibrary.repository.IssuedBookRepository;
import com.example.library.demolibrary.service.IssuedBookResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssuedBookServiceImpl implements IssuedBookResource {

  private IssuedBookRepository issuedBookRepository;

  @Autowired
  public IssuedBookServiceImpl(IssuedBookRepository issuedBookRepository) {
    this.issuedBookRepository = issuedBookRepository;
  }

  @Override
  public void createIssued(IssuedBook issuedBook) {
    issuedBookRepository.save(issuedBook);
  }
}
