package main.designPatterns.factory_car2;

public class LuxuryCar extends Car {
  public LuxuryCar() {
    this.brand = "벤츠";
    this.model = "E-Class";
    this.engineType = EngineType.HYBRID;
    this.price = 7000;
    this.features.add("마사지 시트");
    this.features.add("프리미엄 사운드 시스템");
    this.features.add("자율주행 보조");
    this.features.add("에어 서스펜션");
    this.features.add("프리미엄 가죽 시트");
  }
}
