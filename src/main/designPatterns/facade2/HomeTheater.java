package main.designPatterns.facade2;

public class HomeTheater {
  private TV tv;
  private SoundSystem soundSystem;
  private BluRayPlayer bluRayPlayer;

  public HomeTheater() {
    this.tv = new TV();
    this.soundSystem = new SoundSystem();
    this.bluRayPlayer = new BluRayPlayer();
  }

  public void watchMovie(String movie) {
    System.out.println("홈 시어터를 준비합니다...");

    tv.on();
    tv.setInputChannel("HDMI 1");

    soundSystem.on();
    soundSystem.setVolume(10);

    bluRayPlayer.on();
    bluRayPlayer.play(movie);

    System.out.println("영화가 시작됩니다.");
  }

  public void endMovie() {
    System.out.println("홈 시어터를 종료합니다...");

    bluRayPlayer.off();
    soundSystem.off();
    tv.off();

    System.out.println("영화를 종료했습니다.");
  }
}
