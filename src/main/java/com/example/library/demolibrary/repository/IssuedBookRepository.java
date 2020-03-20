package com.example.library.demolibrary.repository;

import com.example.library.demolibrary.model.entity.IssuedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuedBookRepository extends JpaRepository<IssuedBook, Integer> {

}
