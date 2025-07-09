package main.designPatterns.facade4;

import java.util.Random;

public class SmartCityFacade {
  private TrafficSystem trafficSystem;
  private EnergySystem energySystem;
  private EnvironmentMonitoringSystem environmentSystem;
  private CitySecuritySystem securitySystem;
  private CommunicationSystem communicationSystem;
  private Random random;

  public SmartCityFacade() {
    this.trafficSystem = new TrafficSystem();
    this.energySystem = new EnergySystem();
    this.environmentSystem = new EnvironmentMonitoringSystem();
    this.securitySystem = new CitySecuritySystem();
    this.communicationSystem = new CommunicationSystem();
    this.random = new Random();
  }

  public void activateRushHourMode() {
    System.out.println("출퇴근 모드 활성화...");
    trafficSystem.manageTraffic();
    trafficSystem.optimizeTrafficLights("출근 시간");
    energySystem.optimizeEnergyConsumption("높은 수요");
    environmentSystem.monitorAirQuality();
    System.out.println("출퇴근 모드가 설정되었습니다.");
  }

  public void activateEmergencyMode() {
    System.out.println("비상 모드 활성화...");
    trafficSystem.optimizeTrafficLights("비상 상황");
    energySystem.optimizeEnergyConsumption("비상 전력 절감");
    securitySystem.deployEmergencyProtocols();
    communicationSystem.sendCityAlerts("비상 상황 발생!");
    System.out.println("비상 모드가 설정되었습니다.");
  }

  public void activateWeatherBasedMode() {
    System.out.println("날씨 기반 모드 활성화...");
    environmentSystem.monitorWeatherConditions();
    String weather = getWeather();
    System.out.println("현재 날씨: " + weather);
    if (weather.equals("폭우")) {
      trafficSystem.optimizeTrafficLights("폭우");
      energySystem.optimizeEnergyConsumption("난방 증가");
      communicationSystem.sendCityAlerts("폭우 경고!");
    } else if (weather.equals("더위")) {
      energySystem.optimizeEnergyConsumption("냉방 증가");
      communicationSystem.sendCityAlerts("폭염 경고!");
    } else {
      System.out.println("날씨가 안정적입니다.");
    }
    System.out.println("날씨 기반 모드가 설정되었습니다.");
  }

  private String getWeather() {
    String[] weatherConditions = {"맑음", "폭우", "더위", "눈"};
    return weatherConditions[random.nextInt(weatherConditions.length)];
  }

  public void activateNightMode() {
    System.out.println("야간 모드 활성화...");
    trafficSystem.optimizeTrafficLights("야간");
    energySystem.optimizeEnergyConsumption("낮은 수요");
    securitySystem.activateCitywideSurveillance();
    System.out.println("야간 모드가 설정되었습니다.");
  }
}
