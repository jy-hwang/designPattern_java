package main.designPatterns.facade3;

public class HeatingSystem {
  public void turnOn() {
    System.out.println("난방 시스템이 켜졌습니다.");
  }

  public void turnOff() {
    System.out.println("난방 시스템이 꺼졌습니다.");
  }

  public void setTemperature(double temperature) {
    System.out.println("난방 온도를 " + temperature + "도로 설정했습니다.");
  }
}
