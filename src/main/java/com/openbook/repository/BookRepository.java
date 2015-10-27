package com.openbook.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.openbook.domain.Book;

@RepositoryRestResource
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

	List<Book> findByTitle(@Param("title") String title);
	List<Book> findByAuthor(@Param("author") String author);

}
