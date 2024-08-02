package com.example.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookController controller) {
		return args -> {
			// Create a new book and add it to the repository using POST
			Book newBook = new Book(null, "The Great Gatsby", "F. Scott Fitzgerald");
			Book addedBook = controller.addBook(newBook);
			System.out.println("Book Added: " + addedBook);

			// Retrieve the added book using GET and print the details
			Book retrievedBook = controller.getBookById(addedBook.getId());
			System.out.println("Book Retrieved: " + retrievedBook);

			// Update the book's information using PUT
			Book updatedBook = new Book(null, "The Great Gatsby", "F. Scott Fitzgerald (Updated)");
			Book updatedBookResult = controller.updateBook(addedBook.getId(), updatedBook);
			System.out.println("Book Updated: " + updatedBookResult);

			// Delete the book using DELETE
			controller.deleteBook(addedBook.getId());
			System.out.println("Book Deleted Successfully");

			// Try to retrieve the deleted book and handle the response appropriately
			try {
				controller.getBookById(addedBook.getId());
			} catch (RuntimeException e) {
				System.out.println("Attempting to Retrieve Deleted Book: Book Not Found");
			}
		};
	}
}
