package main.designPatterns.factory_car2;

public enum EngineType {
  GASOLINE("가솔린", 2.0), DIESEL("디젤", 2.5), HYBRID("하이브리드", 1.8), ELECTRIC("전기", 0.0);

  private final String name;
  private final double displacement;

  EngineType(String name, double displacement) {
    this.name = name;
    this.displacement = displacement;
  }

  public String getName() {
    return name;
  }

  public double getDisplacement() {
    return displacement;
  }
}
