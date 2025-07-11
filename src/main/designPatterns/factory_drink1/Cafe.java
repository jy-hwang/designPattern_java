package main.designPatterns.factory_drink1;

public class Cafe {
  private String cafeName;
  private int totalSales = 0; // 총 매출
  private int drinkCount = 0; // 만든 음료 개수

  public Cafe(String cafeName) {
    this.cafeName = cafeName;
  }

  // 음료 주문 받기
  public void takeOrder(String drinkType) {
    System.out.println("\n" + "=".repeat(50));
    System.out.println("🏪 " + cafeName + "에 오신 것을 환영합니다!");
    System.out.println("주문하신 음료: " + drinkType);
    System.out.println("=".repeat(50));

    // Factory를 사용해서 음료 만들기
    Drink drink = DrinkFactory.makeDrink(drinkType);

    // 음료 준비하고 서빙하기
    drink.prepare();
    drink.serve();

    // 매출 계산
    totalSales += drink.getPrice();
    drinkCount++;

    System.out.println("✅ 주문 완료!");
    System.out.println("=".repeat(50));
  }

  // 추천 음료 주문
  public void takeRecommendedOrder() {
    System.out.println("\n" + "=".repeat(50));
    System.out.println("🏪 " + cafeName + "에 오신 것을 환영합니다!");
    System.out.println("=".repeat(50));

    // Factory를 사용해서 추천 음료 만들기
    Drink drink = DrinkFactory.makeRecommendedDrink();

    drink.prepare();
    drink.serve();

    totalSales += drink.getPrice();
    drinkCount++;

    System.out.println("✅ 주문 완료!");
    System.out.println("=".repeat(50));
  }

  // 오늘의 매출 확인
  public void showSalesReport() {
    System.out.println("\n📊 " + cafeName + " 오늘의 매출 현황");
    System.out.println("=".repeat(30));
    System.out.println("판매한 음료 수: " + drinkCount + "잔");
    System.out.println("총 매출: " + String.format("%,d", totalSales) + "원");
    if (drinkCount > 0) {
      System.out.println("평균 단가: " + String.format("%,d", totalSales / drinkCount) + "원");
    }
    System.out.println("=".repeat(30));
  }
}
