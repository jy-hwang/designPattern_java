package main.designPatterns.singleton2;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private static Library instance;
  private List<Book> bookList;

  private Library() {
    this.bookList = new ArrayList<>();
  }

  public static Library getInstance() {
    if (instance == null) {
      instance = new Library();
    }
    return instance;
  }

  public List<Book> getBookList() {
    return bookList;
  }

  public void addBook(Book book) {
    bookList.add(book);
  }

  public void displayBookList() {
    System.out.println("Library Book List:");
    for (Book book : bookList) {
      System.out.println(book);
    }
  }
}
