package com.openbook.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.openbook.domain.Book;
import com.openbook.domain.User;

public interface UserRepository extends PagingAndSortingRepository<Book, Long> {

  List<User> findByUsername(@Param("username") String username);
}
