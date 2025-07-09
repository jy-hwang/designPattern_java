package main.designPatterns.facade4;

public class CommunicationSystem {
  public void manageCityNetwork() {
    System.out.println("통신 시스템: 도시 네트워크 상태를 관리 중입니다.");
  }

  public void sendCityAlerts(String message) {
    System.out.println("통신 시스템: 시민들에게 경고 메시지 전송 - " + message);
  }
}
