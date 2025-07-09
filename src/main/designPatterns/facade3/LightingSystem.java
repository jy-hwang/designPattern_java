package main.designPatterns.facade3;

public class LightingSystem {
  public void turnOn() {
    System.out.println("조명이 켜졌습니다.");
  }

  public void turnOff() {
    System.out.println("조명이 꺼졌습니다.");
  }

  public void setBrightness(int level) {
    System.out.println("조명 밝기를 " + level + "%로 설정했습니다.");
  }
}
