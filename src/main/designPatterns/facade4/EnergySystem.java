package main.designPatterns.facade4;

public class EnergySystem {
  public void manageEnergyUsage() {
    System.out.println("에너지 시스템: 에너지 사용량을 관리하고 있습니다.");
  }

  public void optimizeEnergyConsumption(String condition) {
    System.out.println("에너지 시스템: " + condition + "에 맞춰 에너지 소비를 최적화합니다.");
  }
}
