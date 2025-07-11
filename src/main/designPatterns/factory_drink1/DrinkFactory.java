package main.designPatterns.factory_drink1;

public class DrinkFactory {
  // 음료 종류에 따라 적절한 음료 객체를 만들어서 반환
  public static Drink makeDrink(String drinkType) {
    // 대소문자 구분 없이 처리
    switch (drinkType.toLowerCase()) {
      case "커피":
      case "coffee":
        return new Coffee();
      case "차":
      case "tea":
        return new Tea();
      case "주스":
      case "juice":
        return new Juice();
      case "우유":
      case "milk":
        return new Milk();
      default:
        System.out.println("❌ 죄송합니다. 그런 음료는 만들 수 없어요.");
        System.out.println("💡 대신 인기 메뉴인 커피를 준비해드릴게요!");
        return new Coffee();
    }
  }

  // 메뉴판 보여주기
  public static void showMenu() {
    System.out.println("\n📋 음료 메뉴판 📋");
    System.out.println("==================");
    System.out.println("1. 커피 (Coffee) - 3,000원");
    System.out.println("2. 차 (Tea) - 2,500원");
    System.out.println("3. 주스 (Juice) - 3,500원");
    System.out.println("4. 우유 (Milk) - 2,000원");
    System.out.println("==================");
  }

  // 추천 음료 만들기
  public static Drink makeRecommendedDrink() {
    System.out.println("🌟 오늘의 추천 음료를 준비해드릴게요!");

    // 간단한 랜덤 추천 (실제로는 날씨, 시간 등을 고려할 수 있음)
    String[] recommendations = {"커피", "차", "주스", "우유"};
    int randomIndex = (int) (Math.random() * recommendations.length);
    String recommended = recommendations[randomIndex];

    System.out.println("👨‍🍳 셰프 추천: " + recommended);
    return makeDrink(recommended);
  }
}
