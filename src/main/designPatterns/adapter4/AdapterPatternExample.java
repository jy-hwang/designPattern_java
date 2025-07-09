package main.designPatterns.adapter4;

public class AdapterPatternExample {


  public static void main(String[] args) {
    EuropeanPlug europeanPlug = new USPlugAdapter(new USPlugImpl());
    HotelRoom hotelRoom = new HotelRoom(europeanPlug);

    hotelRoom.useSocket();
  }

}
