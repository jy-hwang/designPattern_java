package main.designPatterns.singleton2;

public class Book {
  private final String title;
  private final String author;
  private boolean isAvailable;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.isAvailable = true;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean available) {
    isAvailable = available;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return String.format("""
        Book {title = %s, author = %s, isAvailable = %s }
        """, title, author, isAvailable);
  }
}
