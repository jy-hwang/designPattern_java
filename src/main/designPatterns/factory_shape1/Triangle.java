package main.designPatterns.factory_shape1;

public class Triangle implements Shape {
  private double base;
  private double height;


  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  @Override
  public void draw() {
    System.out.println("🔺삼각형을 그렸습니다. ");
    System.out.println("밑변 : " + base + ", 높이 :" + height);
  }

  @Override
  public double getArea() {
    return (base * height) / 2;
  }

}
