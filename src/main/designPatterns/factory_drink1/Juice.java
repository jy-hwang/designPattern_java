package main.designPatterns.factory_drink1;

public class Juice implements Drink {
  private String name = "오렌지 주스";
  private int price = 3500;

  @Override
  public void prepare() {
    System.out.println("🍊 " + name + " 준비 중...");
    System.out.println("   1. 신선한 오렌지를 선별합니다");
    System.out.println("   2. 오렌지를 깨끗이 씻습니다");
    System.out.println("   3. 오렌지를 짜서 주스를 만듭니다");
    System.out.println("   4. 얼음을 추가합니다");
  }

  @Override
  public void serve() {
    System.out.println("🎉 시원한 " + name + "가 완성되었습니다!");
    System.out.println("💰 가격: " + price + "원");
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getPrice() {
    return price;
  }

}
