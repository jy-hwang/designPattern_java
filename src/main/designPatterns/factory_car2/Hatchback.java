package main.designPatterns.factory_car2;

public class Hatchback extends Car {
  public Hatchback() {
    this.brand = "폭스바겐";
    this.model = "골프";
    this.engineType = EngineType.GASOLINE;
    this.price = 2800;
    this.features.add("스포츠 서스펜션");
    this.features.add("터보 엔진");
    this.features.add("수동 변속기");
    this.features.add("컴팩트 디자인");
  }
}
