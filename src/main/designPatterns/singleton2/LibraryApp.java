package main.designPatterns.singleton2;

public class LibraryApp {

  public static void main(String[] args) {
    Library library = Library.getInstance();
    library.addBook(new Book("Java Programming", "John Doe"));
    library.addBook(new Book("Design Patterns", "Jane Smith"));
    library.addBook(new Book("Data Structures", "Sam Johnson"));

    // 도서 목록 조회
    library.displayBookList();
    Book javaBook = library.getBookList().get(0);
    borrowBook(javaBook);
    library.displayBookList();
    returnBook(javaBook);
    library.displayBookList();

  }

  private static void borrowBook(Book book) {
    if (book.isAvailable()) {
      System.out.println("Borrowing book : " + book.getTitle());
      book.setAvailable(false);
    } else {
      System.out.println("Book not available for borrowing : " + book.getTitle());
    }
  }

  private static void returnBook(Book book) {
    if (!book.isAvailable()) {
      System.out.println("Returning book : " + book.getTitle());
      book.setAvailable(true);
    } else {
      System.out.println("Book is already available : " + book.getTitle());
    }
  }

}
