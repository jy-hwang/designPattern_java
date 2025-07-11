package main.designPatterns.factory_drink1;

import java.util.Scanner;

public class SimpleDrinkFactory {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("☕ 간단한 카페 시스템에 오신 것을 환영합니다!");
    System.out.println("Factory 패턴을 사용해서 음료를 만들어보겠습니다.\n");

    Cafe myCafe = new Cafe("코딩 카페");

    // 메뉴판 보여주기
    DrinkFactory.showMenu();

    // 다양한 주문 예시
    demonstrateOrders(myCafe);

    // 사용자 주문 받기
    takeUserOrders(myCafe);

    // 매출 보고서
    myCafe.showSalesReport();

    scanner.close();
  }

  // 다양한 주문 예시 보여주기
  private static void demonstrateOrders(Cafe cafe) {
    System.out.println("\n🎬 주문 예시를 보여드릴게요!\n");

    // 1. 일반 주문들
    cafe.takeOrder("커피");
    cafe.takeOrder("주스");
    cafe.takeOrder("차");

    // 2. 잘못된 주문 (에러 처리 확인)
    cafe.takeOrder("콜라"); // 없는 메뉴

    // 3. 추천 주문
    cafe.takeRecommendedOrder();
  }

  // 사용자로부터 직접 주문 받기
  private static void takeUserOrders(Cafe cafe) {
    System.out.println("\n🙋‍♀️ 이제 직접 주문해보세요!");

    while (true) {
      System.out.println("\n무엇을 주문하시겠어요?");
      System.out.println("1. 직접 주문하기");
      System.out.println("2. 추천 메뉴 주문하기");
      System.out.println("3. 메뉴판 다시 보기");
      System.out.println("4. 주문 종료");
      System.out.print("선택 (1-4): ");

      int choice = getIntInput(1, 4);

      switch (choice) {
        case 1:
          System.out.print("어떤 음료를 원하세요? (커피/차/주스/우유): ");
          String drinkChoice = scanner.nextLine().trim();
          cafe.takeOrder(drinkChoice);
          break;
        case 2:
          cafe.takeRecommendedOrder();
          break;
        case 3:
          DrinkFactory.showMenu();
          break;
        case 4:
          System.out.println("🙏 이용해 주셔서 감사합니다!");
          return;
      }
    }
  }

  // 안전한 숫자 입력 받기
  private static int getIntInput(int min, int max) {
    while (true) {
      try {
        String input = scanner.nextLine().trim();
        int value = Integer.parseInt(input);
        if (value >= min && value <= max) {
          return value;
        } else {
          System.out.print("❌ " + min + "부터 " + max + " 사이의 숫자를 입력하세요: ");
        }
      } catch (NumberFormatException e) {
        System.out.print("❌ 올바른 숫자를 입력하세요: ");
      }
    }
  }
}
