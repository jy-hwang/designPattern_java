package main.designPatterns.adapter4;

public class HotelRoom {
  private final EuropeanPlug europeanPlug;

  public HotelRoom(EuropeanPlug europeanPlug) {
    this.europeanPlug = europeanPlug;
  }

  public void useSocket() {
    System.out.println("Using European socket in the hotel room");
    europeanPlug.plugIntoEuropenSocket();
  }

}
