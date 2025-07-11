package main.designPatterns.factory_car2;

public class ElectricCar extends Car {
  public ElectricCar() {
    this.brand = "테슬라";
    this.model = "Model 3";
    this.engineType = EngineType.ELECTRIC;
    this.price = 5500;
    this.features.add("오토파일럿");
    this.features.add("슈퍼차징 지원");
    this.features.add("대형 터치스크린");
    this.features.add("무선 업데이트");
  }

  @Override
  protected void installEngine() {
    System.out.println("🔋 전기 모터 및 배터리 설치");
  }
}
