package main.designPatterns.prototype1;

import java.util.ArrayList;

// 복합객체
class Book {

  private String author;
  private String title;

  public Book(String author, String title) {
    this.author = author;
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String toString() {
    return "(" + title + "," + author + ")";
  }
}


// Clonable 를 구현한다 == BookShelf 클래스는 Clone 해도 된다, Mark Interface
class BookShelf implements Cloneable {
  // 멤버 변수
  private ArrayList<Book> shelf;

  // 생성자
  public BookShelf() {
    shelf = new ArrayList<Book>();
  }

  // 멤버 메서드
  public void addBook(Book book) {
    shelf.add(book);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    BookShelf another = new BookShelf();

    for (Book book : shelf) {
      another.addBook(new Book(book.getAuthor(), book.getTitle()));
    }

    // 깊은 복사
    return another;

    // 얕은 복사
    // return super.clone();
  }

  public ArrayList<Book> getShelf() {
    return shelf;
  }

  public void setShelf(ArrayList<Book> shelf) {
    this.shelf = shelf;
  }

  public String toString() {
    System.out.println("---");
    return shelf.toString();
  }

}


public class PrototypeTest {

  public static void main(String[] args) throws CloneNotSupportedException {
    BookShelf bookShelf = new BookShelf();

    bookShelf.addBook(new Book("조정래", "태백산맥"));
    bookShelf.addBook(new Book("박완서", "나목"));
    bookShelf.addBook(new Book("박경리", "박경리"));

    System.out.println(bookShelf);

    BookShelf another = (BookShelf) bookShelf.clone();

    System.out.println(another);

    bookShelf.getShelf().get(0).setAuthor("조정래");
    bookShelf.getShelf().get(0).setTitle("한강");

    System.out.println(bookShelf);
    System.out.println(another);
  }

}
