package com.example.library.demolibrary.specification;

import com.example.library.demolibrary.model.dto.BookDto;
import com.example.library.demolibrary.model.entity.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class BookSpecification implements Specification<Book> {

  private BookDto bookDto;

  public BookSpecification(BookDto bookDto) {
    this.bookDto = bookDto;
  }

  @Override
  public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> criteriaQuery,
      CriteriaBuilder criteriaBuilder) {
    List<Predicate> predicates = new ArrayList<>();

    if (Objects.nonNull(bookDto.getAuthor())) {
      predicates.add(criteriaBuilder.equal(root.get("author"), bookDto.getAuthor()));
    }

    if (Objects.nonNull(bookDto.getSubject())) {
      predicates.add(criteriaBuilder.equal(root.get("subject"), bookDto.getSubject()));
    }

    if (Objects.nonNull(bookDto.getIsbn())) {
      predicates.add(criteriaBuilder.equal(root.get("isbn"), bookDto.getIsbn()));
    }

    return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
  }
}
