package main.designPatterns.factory_shape1;

public class ShapeFactory {
  // 도형 타입에 따라 적절한 도형 객체를 생성해서 반환
  public static Shape createShape(String shapeType) {
    // 입력값을 소문자로 변환해서 대소문자 구분 없이 처리
    switch (shapeType.toLowerCase()) {
      case "원":
      case "circle":
        return new Circle(5.0); // 기본 반지름 5
      case "사각형":
      case "rectangle":
        return new Rectangle(10.0, 8.0); // 기본 가로 10, 세로 8
      case "삼각형":
      case "triangle":
        return new Triangle(6.0, 4.0); // 기본 밑변 6, 높이 4
      default:
        System.out.println("❌ 알 수 없는 도형입니다. 원을 기본으로 생성합니다.");
        return new Circle(5.0);
    }
  }

  // 사용자가 크기를 지정할 수 있는 버전
  public static Shape createShape(String shapeType, double... sizes) {
    switch (shapeType.toLowerCase()) {
      case "원":
      case "circle":
        double radius = (sizes.length > 0) ? sizes[0] : 5.0;
        return new Circle(radius);

      case "사각형":
      case "rectangle":
        double width = (sizes.length > 0) ? sizes[0] : 10.0;
        double height = (sizes.length > 1) ? sizes[1] : 8.0;
        return new Rectangle(width, height);

      case "삼각형":
      case "triangle":
        double base = (sizes.length > 0) ? sizes[0] : 6.0;
        double triangleHeight = (sizes.length > 1) ? sizes[1] : 4.0;
        return new Triangle(base, triangleHeight);

      default:
        System.out.println("❌ 알 수 없는 도형입니다. 원을 기본으로 생성합니다.");
        return new Circle(5.0);
    }
  }

  // 사용 가능한 도형 목록 출력
  public static void printAvailableShapes() {
    System.out.println("\n📋 생성 가능한 도형들:");
    System.out.println("==================");
    System.out.println("1. 원 (Circle)");
    System.out.println("2. 사각형 (Rectangle)");
    System.out.println("3. 삼각형 (Triangle)");
    System.out.println("==================");
  }
}
