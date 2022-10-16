package com.maverick.bookstore.bootstrap;

import com.maverick.bookstore.domain.Author;
import com.maverick.bookstore.domain.Book;
import com.maverick.bookstore.repositories.AuthorRepository;
import com.maverick.bookstore.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;

public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting Bootstrap .......");

        Author simon = new Author("Simon", "Saliba");
        Book ddd = new Book("Domain Driven Design", "123123");
        simon.getBooks().add(ddd);
        ddd.getAuthors().add(simon);

        authorRepository.save(simon);
        bookRepository.save(ddd);

        Author rod = new Author("Rod" , "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "45554637");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Number of Books: " + bookRepository.count());
    }
}
