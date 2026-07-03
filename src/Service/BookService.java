package Service;

import Model.Book;

import java.util.List;

public interface BookService {

    void addBook(Book book);
    void removeBookById(Long id);
//
     List<Book> showAllBooks();
//
//    List<Book> sortBooks();
//
//    Book searchBookById(Long id);
//
//    Book searchBookByTitle(String title);
//
//    List<Book> searchBookByAuthor(String author);


}
