package Service;

import Model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImp implements BookService{

    List<Book>books=new ArrayList<>();
    @Override
    public void addBook(Book book) {

      if(books.stream().anyMatch(n->n.getId().equals(book.getId()))){
          System.err.println("This Id already exist");


      }else {
          books.add(book);
      }
    }
}
