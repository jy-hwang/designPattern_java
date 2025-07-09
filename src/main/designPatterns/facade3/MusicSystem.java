package main.designPatterns.facade3;

public class MusicSystem {
  public void playMusic(String playlist) {
    System.out.println("재생 중: " + playlist + " 플레이리스트.");
  }

  public void stopMusic() {
    System.out.println("음악 재생이 중지되었습니다.");
  }
}
