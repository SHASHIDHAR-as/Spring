package com.example.bookstore;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository = new BookRepository();

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        Book addedBook = bookRepository.addBook(book);
        addHateoasLinks(addedBook);
        return addedBook;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookRepository.getBookById(id)
                .map(this::addHateoasLinks)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks().stream()
                .map(this::addHateoasLinks)
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookRepository.updateBook(id, book)
                .map(this::addHateoasLinks)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        if (!bookRepository.deleteBook(id)) {
            throw new RuntimeException("Book not found");
        }
    }

    private Book addHateoasLinks(Book book) {
        Link selfLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getBookById(book.getId())).withSelfRel();
        Link updateLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).updateBook(book.getId(), book)).withRel("update");
//        Link deleteLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).deleteBook(book.getId())).withRel("delete");
        book.add(selfLink, updateLink);
        return book;
    }
}
