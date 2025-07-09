package main.designPatterns.facade3;

public class SmartHomeFacade {
  private LightingSystem lightingSystem;
  private HeatingSystem heatingSystem;
  private SecuritySystem securitySystem;
  private MusicSystem musicSystem;

  public SmartHomeFacade() {
    this.lightingSystem = new LightingSystem();
    this.heatingSystem = new HeatingSystem();
    this.securitySystem = new SecuritySystem();
    this.musicSystem = new MusicSystem();
  }

  public void activateAwayMode() {
    System.out.println("외출 모드를 활성화합니다...");

    lightingSystem.turnOff();
    heatingSystem.turnOff();
    securitySystem.activate();
    musicSystem.stopMusic();

    System.out.println("외출 모드가 설정되었습니다...");
  }

  public void activateHomeMode() {
    System.out.println("집 모드를 활성화합니다...");

    lightingSystem.turnOn();
    lightingSystem.setBrightness(70);
    heatingSystem.turnOn();
    heatingSystem.setTemperature(22.5);
    securitySystem.deactivate();
    musicSystem.playMusic("집에서 듣기 좋은 노래");

    System.out.println("집 모드가 설정되었습니다...");
  }

  public void activateMovieMode() {
    System.out.println("영화 모드를 활성화합니다...");

    lightingSystem.setBrightness(30);
    heatingSystem.setTemperature(21);
    musicSystem.playMusic("영화 배경 음악");

    System.out.println("영화 모드가 설정되었습니다...");
  }

}
