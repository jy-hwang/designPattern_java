package main.designPatterns.factory_shape1;

public class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println("🔵 원을 그렸습니다.");
    System.out.println("반지름 : " + radius);
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

}
