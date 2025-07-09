package main.designPatterns.facade2;

public class SoundSystem {
  public void on() {
    System.out.println("사운드 시스템이 켜졌습니다.");
  }

  public void off() {
    System.out.println("사운드 시스템이  꺼졌습니다.");
  }

  public void setVolume(int level) {
    System.out.println("볼륨을 " + level + "(으)로 설정했습니다.");
  }
}
