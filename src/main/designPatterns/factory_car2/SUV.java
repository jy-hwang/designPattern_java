package main.designPatterns.factory_car2;

public class SUV extends Car {
  public SUV() {
    this.brand = "기아";
    this.model = "쏘렌토";
    this.engineType = EngineType.DIESEL;
    this.price = 4200;
    this.features.add("AWD 시스템");
    this.features.add("파노라마 선루프");
    this.features.add("7인승 시트");
    this.features.add("오프로드 모드");
  }
}
