package Controller;

public class ResponseBook {
  private   String BookTitle;

    public ResponseBook(String bookTitle) {
        BookTitle = bookTitle;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }
}
