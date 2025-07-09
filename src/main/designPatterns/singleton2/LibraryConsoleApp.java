package main.designPatterns.singleton2;

import java.util.Scanner;

public class LibraryConsoleApp {
  public static void main(String[] args) {
    // 도서관 및 입력용 Scanner 객체 생성
    Library library = Library.getInstance();
    Scanner scanner = new Scanner(System.in);

    // 사용자가 5를 선택할 때까지 반복
    while (true) {
      // 메뉴 출력
      System.out.println("\n===== Library Management System =====");
      System.out.println("1. Display Book List");
      System.out.println("2. Add Book");
      System.out.println("3. Borrow Book");
      System.out.println("4. Return Book");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");

      // 사용자 입력 처리
      int choice = scanner.nextInt();
      scanner.nextLine(); // Enter key 처리

      // 사용자 선택에 따른 동작 수행
      switch (choice) {
        case 1:
          displayBookList(library);
          break;
        case 2:
          addBook(library, scanner);
          break;
        case 3:
          borrowBook(library, scanner);
          break;
        case 4:
          returnBook(library, scanner);
          break;
        case 5:
          System.out.println("Exiting the program. Goodbye!");
          System.exit(0);
        default:
          System.out.println("Invalid choice. Please enter a number between 1 and 5.");
      }
    }
  }

  // 도서 목록 출력
  private static void displayBookList(Library library) {
    System.out.println("\n===== Book List =====");
    library.displayBookList();
  }

  // 도서 추가
  private static void addBook(Library library, Scanner scanner) {
    System.out.print("Enter the title of the book: ");
    String title = scanner.nextLine();
    System.out.print("Enter the author of the book: ");
    String author = scanner.nextLine();

    // 새로운 Book 객체 생성 및 추가
    Book newBook = new Book(title, author);
    library.addBook(newBook);
    System.out.println("Book added successfully: " + newBook);
  }

  // 도서 대출
  private static void borrowBook(Library library, Scanner scanner) {
    System.out.print("Enter the title of the book to borrow: ");
    String titleToBorrow = scanner.nextLine();
    Book bookToBorrow = findBook(library, titleToBorrow);

    // 도서가 존재하면 대출 수행
    if (bookToBorrow != null) {
      borrowBook(bookToBorrow);
      System.out.println("Book borrowed successfully: " + bookToBorrow);
    } else {
      System.out.println("Book not found in the library: " + titleToBorrow);
    }
  }

  // 도서 반납
  private static void returnBook(Library library, Scanner scanner) {
    System.out.print("Enter the title of the book to return: ");
    String titleToReturn = scanner.nextLine();
    Book bookToReturn = findBook(library, titleToReturn);

    // 도서가 존재하면 반납 수행
    if (bookToReturn != null) {
      returnBook(bookToReturn);
      System.out.println("Book returned successfully: " + bookToReturn);
    } else {
      System.out.println("Book not found in the library: " + titleToReturn);
    }
  }

  // 도서 검색
  private static Book findBook(Library library, String title) {
    for (Book book : library.getBookList()) {
      if (book.getTitle().equalsIgnoreCase(title)) {
        return book;
      }
    }
    return null;
  }

  // 도서 대출
  private static void borrowBook(Book book) {
    if (book.isAvailable()) {
      book.setAvailable(false);
    } else {
      System.out.println("Book is not available for borrowing: " + book.getTitle());
    }
  }

  // 도서 반납
  private static void returnBook(Book book) {
    if (!book.isAvailable()) {
      book.setAvailable(true);
    } else {
      System.out.println("Book is already available: " + book.getTitle());
    }
  }
}
