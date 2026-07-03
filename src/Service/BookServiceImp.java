package Service;

import Model.ResponseBook;
import Model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImp implements BookService {

    List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {

        if (books.stream().anyMatch(n -> n.getId().equals(book.getId()))) {
            System.err.println("This Id already exist");

        } else {
            books.add(book);
        }
    }

    @Override
    public void removeBookById(Long id) {
        if (books.stream().anyMatch(n -> n.getId() == id)) {
            var result = books.removeIf(n -> n.getId().equals(id));
            if (result) {
                System.out.println("book successfully removed");
            } else {
                System.err.println("book did not remove");
            }
            return;

        }else System.err.println("book is not found");
    }

    @Override
    public List<ResponseBook> showAllBooks() {
        return books.stream()
                .map(n->new ResponseBook(n.getTitle())) deyisikler edecem
                ;
    }
}
