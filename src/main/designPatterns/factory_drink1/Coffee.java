package main.designPatterns.factory_drink1;

public class Coffee implements Drink {
  private String name = "아메리카노";
  private int price = 3000;

  @Override
  public void prepare() {
    System.out.println("☕ " + name + " 준비 중...");
    System.out.println("   1. 원두를 갈고 있습니다");
    System.out.println("   2. 뜨거운 물을 준비합니다");
    System.out.println("   3. 에스프레소를 추출합니다");
    System.out.println("   4. 물을 추가합니다");
  }

  @Override
  public void serve() {
    System.out.println("🎉 따뜻한 " + name + "이 완성되었습니다!");
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
