package main.designPatterns.factory_drink1;

public class Milk implements Drink{
  private String name = "딸기 우유";
  private int price = 2000;
  
  @Override
  public void prepare() {
      System.out.println("🥛 " + name + " 준비 중...");
      System.out.println("   1. 신선한 우유를 준비합니다");
      System.out.println("   2. 딸기 시럽을 추가합니다");
      System.out.println("   3. 잘 저어줍니다");
      System.out.println("   4. 차갑게 보관합니다");
  }
  
  @Override
  public void serve() {
      System.out.println("🎉 달콤한 " + name + "가 완성되었습니다!");
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
