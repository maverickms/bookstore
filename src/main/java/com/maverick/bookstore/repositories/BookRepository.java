package com.maverick.bookstore.repositories;

import com.maverick.bookstore.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}