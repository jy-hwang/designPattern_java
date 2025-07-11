package main.designPatterns.factory_shape1;

public class Rectangle implements Shape {

  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public void draw() {
    System.out.println("🟦 사각형을 그렸습니다.");
    System.out.println("가로 : " + width + ", 세로 : " + height);
  }

  @Override
  public double getArea() {
    return width * height;
  }

}
