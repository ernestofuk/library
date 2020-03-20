package com.example.library.demolibrary.util;

import com.example.library.demolibrary.model.entity.Book;
import com.example.library.demolibrary.model.entity.User;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class Util {

  public static boolean validateUser(User user) {
    if (Objects.isNull(user) && StringUtils.isBlank(user.getName())) {
      return false;
    }
    return true;
  }

  public static boolean validateBook(Book book) {
    if (Objects.isNull(book) && StringUtils.isBlank(book.getTitle())) {
      return false;
    }
    return true;
  }
}
