package com.maverick.bookstore.repositories;

import com.maverick.bookstore.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
