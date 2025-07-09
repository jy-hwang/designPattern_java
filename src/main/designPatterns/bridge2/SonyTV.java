package main.designPatterns.bridge2;

public class SonyTV implements TV {

  @Override
  public void turnOn() {
    System.out.println("Sony TV is ON");
  }

  @Override
  public void turnOff() {
    System.out.println("Sony TV is OFF");
  }

  @Override
  public void setChannel(int channel) {
    System.out.println("Sony TV channel set to " + channel);
  }

}
