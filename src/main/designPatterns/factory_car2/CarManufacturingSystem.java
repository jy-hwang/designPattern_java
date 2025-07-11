package main.designPatterns.factory_car2;

import java.util.Arrays;
import java.util.List;

public class CarManufacturingSystem {
  public static void main(String[] args) {
    System.out.println("🏭 자동차 제조 시스템에 오신 것을 환영합니다!");

    CarManufacturer manufacturer = new CarManufacturer("글로벌 자동차");

    // 카탈로그 출력
    CarFactory.printCatalog();

    // 1. 기본 자동차 제조
    System.out.println("\n" + "=".repeat(60));
    System.out.println("📋 오늘의 제조 주문들");
    System.out.println("=".repeat(60));

    Car car1 = manufacturer.produceCar("세단");
    car1.displayInfo();

    Car car2 = manufacturer.produceCar("SUV");
    car2.displayInfo();

    // 2. 맞춤형 자동차 제조
    List<String> customFeatures = Arrays.asList("선루프", "프리미엄 오디오", "네비게이션");
    Car car3 = manufacturer.produceCustomCar("전기차", "빨간색", customFeatures);
    car3.displayInfo();

    // 3. 브랜드별 추천 자동차
    System.out.println("\n🏷️ 브랜드별 추천 자동차:");
    Car recommended1 = CarFactory.createRecommendedCar("테슬라");
    recommended1.displayInfo();

    // 4. 예산별 자동차 추천
    System.out.println("\n💰 예산별 자동차 추천:");
    Car budget1 = CarFactory.createCarByBudget(2500);
    budget1.displayInfo();

    Car budget2 = CarFactory.createCarByBudget(6000);
    budget2.displayInfo();
  }
}
