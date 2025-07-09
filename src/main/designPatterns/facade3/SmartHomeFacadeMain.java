package main.designPatterns.facade3;

public class SmartHomeFacadeMain {
  public static void main(String[] args) {
    SmartHomeFacade smartHome = new SmartHomeFacade();

    smartHome.activateAwayMode();
    System.out.println();

    smartHome.activateHomeMode();
    System.out.println();

    smartHome.activateMovieMode();

  }
}
