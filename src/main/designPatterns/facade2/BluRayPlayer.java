package main.designPatterns.facade2;

public class BluRayPlayer {
  public void on() {
    System.out.println("블루레이 플레이어가 켜졌습니다.");
  }

  public void off() {
    System.out.println("블루레이 플레이어가 꺼졌습니다.");
  }

  public void play(String movie) {
    System.out.println(movie + "(을)를 재생합니다.");
  }
}
