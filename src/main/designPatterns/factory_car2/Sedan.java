package main.designPatterns.factory_car2;

public class Sedan extends Car {
  public Sedan() {
      this.brand = "현대";
      this.model = "소나타";
      this.engineType = EngineType.GASOLINE;
      this.price = 3000;
      this.features.add("후방 카메라");
      this.features.add("스마트 크루즈 컨트롤");
      this.features.add("블루투스 연결");
      this.features.add("안전 에어백");
  }
}