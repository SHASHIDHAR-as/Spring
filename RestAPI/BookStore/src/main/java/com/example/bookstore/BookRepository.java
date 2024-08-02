package com.example.bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {
    private final List<Book> books = new ArrayList<>();
    private Long nextId = 1L;

    public Book addBook(Book book) {
        book.setId(nextId++);
        books.add(book);
        return book;
    }

    public Optional<Book> getBookById(Long id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public Optional<Book> updateBook(Long id, Book newBook) {
        return getBookById(id).map(book -> {
            book.setTitle(newBook.getTitle());
            book.setAuthor(newBook.getAuthor());
            return book;
        });
    }

    public boolean deleteBook(Long id) {
        return books.removeIf(book -> book.getId().equals(id));
    }
}
