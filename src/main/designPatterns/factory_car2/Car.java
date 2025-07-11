package main.designPatterns.factory_car2;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
  protected String brand;
  protected String model;
  protected EngineType engineType;
  protected int price;
  protected List<String> features = new ArrayList<>();
  protected String color = "흰색";

  // 자동차 제조 과정
  public void manufacture() {
    System.out.println("🏭 " + brand + " " + model + " 제조 시작");
    System.out.println("─".repeat(40));

    buildFrame();
    installEngine();
    installInterior();
    installFeatures();
    paintCar();
    qualityCheck();

    System.out.println("✅ " + brand + " " + model + " 제조 완료!");
    System.out.println("─".repeat(40));
  }

  protected void buildFrame() {
    System.out.println("🔧 차체 프레임 제작");
  }

  protected void installEngine() {
    System.out.println("🔋 " + engineType.getName() + " 엔진 설치 (" + engineType.getDisplacement() + "L)");
  }

  protected void installInterior() {
    System.out.println("🪑 내부 인테리어 설치");
  }

  protected void installFeatures() {
    System.out.println("⚙️ 추가 기능 설치:");
    for (String feature : features) {
      System.out.println("   - " + feature);
    }
  }

  protected void paintCar() {
    System.out.println("🎨 " + color + " 색상 도색");
  }

  protected void qualityCheck() {
    System.out.println("🔍 품질 검사 완료");
  }

  // 자동차 정보 출력
  public void displayInfo() {
    System.out.println("\n🚗 자동차 정보");
    System.out.println("==================");
    System.out.println("브랜드: " + brand);
    System.out.println("모델: " + model);
    System.out.println("엔진: " + engineType.getName() + " " + engineType.getDisplacement() + "L");
    System.out.println("가격: " + String.format("%,d", price) + "만원");
    System.out.println("색상: " + color);
    System.out.println("주요 기능:");
    for (String feature : features) {
      System.out.println("  • " + feature);
    }
    System.out.println("==================");
  }

  // getter/setter
  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public int getPrice() {
    return price;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
