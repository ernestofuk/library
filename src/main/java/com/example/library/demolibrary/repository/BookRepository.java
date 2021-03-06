package com.example.library.demolibrary.repository;

import com.example.library.demolibrary.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>,
    JpaSpecificationExecutor<Book> {

}
