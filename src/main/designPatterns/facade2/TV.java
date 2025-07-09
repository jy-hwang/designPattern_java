package main.designPatterns.facade2;

public class TV {
  public void on() {
    System.out.println("TV가 켜졌습니다.");
  }

  public void off() {
    System.out.println("TV가 꺼졌습니다.");
  }

  public void setInputChannel(String channel) {
    System.out.println("TV입력 채널을 " + channel + "(으)로 설정했습니다.");
  }
}
