package main.designPatterns.facade4;

public class TrafficSystem {
  public void manageTraffic() {
    System.out.println("교통 시스템: 교통 신호를 최적화하고 차량 흐름을 관리 중입니다.");
  }

  public void optimizeTrafficLights(String timeOfDay) {
    System.out.println("교통 시스템: " + timeOfDay + "에 맞춰 신호등 시간을 조정합니다.");
  }
}
