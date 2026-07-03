package Controller;

import Model.Book;
import Service.BookService;
import Service.BookServiceImp;

import java.util.Scanner;

public class Controller {

    public void start() {
        Scanner sc = new Scanner(System.in);
        BookService bookService = new BookServiceImp();
        boolean check = true;

        do {
            System.out.println("Library Management System  choose one of them");
            System.out.println("""
                    1.Add book
                    2.Remove book
                    3.Show all books
                    4.Sort books
                    5.Search book
                    6.Book analytics
                    7.Exit
                    """);

            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("Enter BookId:");
                    Long id = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Enter BookTitle");
                    String title = sc.nextLine();
                    System.out.println("Enter Author");
                    String author = sc.nextLine();
                    System.out.println("Enter Price");
                    Double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Category");
                    String category = sc.nextLine();
                    Book book = new Book(id, title, author, price, category);
                    bookService.addBook(book);
                    break;
                case 2:
                var removeId=sc.nextLong();
                sc.nextLine();
                bookService.removeBookById(removeId);
                    break;
                case 3:
                 var result=   bookService.showAllBooks();
                    System.out.println(result);

                    break;
            }


            System.out.println("If you wont cantinyou say yes/not");

            var result = sc.nextLine();

            check = switch (result) {
                case "yes" -> true;
                case "not" -> false;
                default -> {
                    System.out.println("It is not correct answer");
                    yield false;
                }
            };


        } while (check);

    }

}
