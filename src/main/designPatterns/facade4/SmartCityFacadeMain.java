package main.designPatterns.facade4;

public class SmartCityFacadeMain {

  public static void main(String[] args) {

    SmartCityFacade smartCity = new SmartCityFacade();

    smartCity.activateRushHourMode();
    System.out.println();

    smartCity.activateEmergencyMode();
    System.out.println();

    smartCity.activateWeatherBasedMode();
    System.out.println();

    smartCity.activateNightMode();

  }

}
