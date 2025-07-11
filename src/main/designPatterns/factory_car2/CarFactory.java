package main.designPatterns.factory_car2;

import java.util.List;

public class CarFactory {
  public static Car createCar(String type) {
    switch (type.toLowerCase()) {
      case "세단":
      case "sedan":
        return new Sedan();
      case "suv":
      case "에스유브이":
        return new SUV();
      case "해치백":
      case "hatchback":
        return new Hatchback();
      case "전기차":
      case "electric":
        return new ElectricCar();
      case "럭셔리":
      case "luxury":
        return new LuxuryCar();
      default:
        System.out.println("❌ 알 수 없는 자동차 타입입니다. 세단으로 대체합니다.");
        return new Sedan();
    }
  }

  // 맞춤형 자동차 생성 (여러 옵션 포함)
  public static Car createCustomCar(String type, String color, List<String> additionalFeatures) {
    Car car = createCar(type);

    if (color != null && !color.isEmpty()) {
      car.setColor(color);
    }

    if (additionalFeatures != null && !additionalFeatures.isEmpty()) {
      car.features.addAll(additionalFeatures);
    }

    return car;
  }

  // 브랜드별 추천 자동차 생성
  public static Car createRecommendedCar(String brand) {
    switch (brand.toLowerCase()) {
      case "현대":
      case "hyundai":
        return new Sedan();
      case "기아":
      case "kia":
        return new SUV();
      case "테슬라":
      case "tesla":
        return new ElectricCar();
      case "벤츠":
      case "mercedes":
        return new LuxuryCar();
      default:
        System.out.println("❌ 해당 브랜드의 추천 모델이 없습니다. 기본 세단을 제공합니다.");
        return new Sedan();
    }
  }

  // 가격대별 자동차 추천
  public static Car createCarByBudget(int budget) {
    if (budget < 3000) {
      System.out.println("💰 예산에 맞는 해치백을 추천합니다.");
      return new Hatchback();
    } else if (budget < 4000) {
      System.out.println("💰 예산에 맞는 세단을 추천합니다.");
      return new Sedan();
    } else if (budget < 5000) {
      System.out.println("💰 예산에 맞는 SUV를 추천합니다.");
      return new SUV();
    } else if (budget < 6000) {
      System.out.println("💰 예산에 맞는 전기차를 추천합니다.");
      return new ElectricCar();
    } else {
      System.out.println("💰 예산에 맞는 럭셔리카를 추천합니다.");
      return new LuxuryCar();
    }
  }

  // 사용 가능한 자동차 카탈로그
  public static void printCatalog() {
    System.out.println("\n🚗 자동차 카탈로그 🚗");
    System.out.println("========================");
    System.out.println("1. 세단 (Sedan) - 3,000만원");
    System.out.println("2. SUV - 4,200만원");
    System.out.println("3. 해치백 (Hatchback) - 2,800만원");
    System.out.println("4. 전기차 (Electric) - 5,500만원");
    System.out.println("5. 럭셔리 (Luxury) - 7,000만원");
    System.out.println("========================");
  }
}
