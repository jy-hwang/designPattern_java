package main.designPatterns.facade2;

public class HomeTheaterMain {

  public static void main(String[] args) {

    HomeTheater homeTheater = new HomeTheater();

    homeTheater.watchMovie("인터스텔라");
    System.out.println();
    homeTheater.endMovie();
  }

}
