package main.designPatterns.factory_shape1;

import java.util.Scanner;

public class SimpleShapeFactory {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("🎨 도형 생성 프로그램에 오신 것을 환영합니다!");
    System.out.println("Factory 패턴을 사용해서 도형을 생성해보겠습니다.");

    // 사용 가능한 도형들 보여주기
    ShapeFactory.printAvailableShapes();

    // 1. 기본 크기로 도형 생성하기
    System.out.println("\n" + "=".repeat(50));
    System.out.println("📐 1단계: 기본 크기 도형 생성");
    System.out.println("=".repeat(50));

    createBasicShapes();

    // 2. 사용자 정의 크기로 도형 생성하기
    System.out.println("\n" + "=".repeat(50));
    System.out.println("📏 2단계: 사용자 정의 크기 도형 생성");
    System.out.println("=".repeat(50));

    createCustomShapes();

    scanner.close();
  }

  // 기본 크기 도형들 생성
  private static void createBasicShapes() {
    String[] shapeTypes = {"원", "사각형", "삼각형"};

    for (String shapeType : shapeTypes) {
      System.out.println("\n🔧 " + shapeType + " 생성 중...");

      // Factory를 사용해서 도형 생성
      Shape shape = ShapeFactory.createShape(shapeType);

      // 도형 그리기
      shape.draw();

      // 넓이 계산해서 출력
      System.out.println("📊 넓이: " + String.format("%.2f", shape.getArea()));
    }
  }

  // 사용자 정의 크기 도형들 생성
  private static void createCustomShapes() {
    System.out.print("생성하고 싶은 도형을 입력하세요 (원/사각형/삼각형): ");
    String userChoice = scanner.nextLine().trim();

    Shape customShape = null;

    switch (userChoice.toLowerCase()) {
      case "원":
      case "circle":
        System.out.print("반지름을 입력하세요: ");
        double radius = getDoubleInput();
        customShape = ShapeFactory.createShape("원", radius);
        break;

      case "사각형":
      case "rectangle":
        System.out.print("가로 길이를 입력하세요: ");
        double width = getDoubleInput();
        System.out.print("세로 길이를 입력하세요: ");
        double height = getDoubleInput();
        customShape = ShapeFactory.createShape("사각형", width, height);
        break;

      case "삼각형":
      case "triangle":
        System.out.print("밑변 길이를 입력하세요: ");
        double base = getDoubleInput();
        System.out.print("높이를 입력하세요: ");
        double triangleHeight = getDoubleInput();
        customShape = ShapeFactory.createShape("삼각형", base, triangleHeight);
        break;

      default:
        System.out.println("❌ 잘못된 입력입니다. 기본 원을 생성합니다.");
        customShape = ShapeFactory.createShape("원");
    }

    if (customShape != null) {
      System.out.println("\n✨ 사용자 정의 도형 생성 완료!");
      customShape.draw();
      System.out.println("📊 넓이: " + String.format("%.2f", customShape.getArea()));
    }
  }

  // 안전한 숫자 입력 받기
  private static double getDoubleInput() {
    while (true) {
      try {
        String input = scanner.nextLine().trim();
        double value = Double.parseDouble(input);
        if (value > 0) {
          return value;
        } else {
          System.out.print("❌ 0보다 큰 숫자를 입력해주세요: ");
        }
      } catch (NumberFormatException e) {
        System.out.print("❌ 올바른 숫자를 입력해주세요: ");
      }
    }
  }
}
