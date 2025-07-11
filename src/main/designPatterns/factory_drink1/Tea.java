package main.designPatterns.factory_drink1;

public class Tea implements Drink {
  private String name = "녹차";
  private int price = 2500;

  @Override
  public void prepare() {
    System.out.println("🍃 " + name + " 준비 중...");
    System.out.println("   1. 찻잎을 준비합니다");
    System.out.println("   2. 물을 80도로 끓입니다");
    System.out.println("   3. 찻잎을 우려냅니다");
    System.out.println("   4. 3분간 기다립니다");
  }

  @Override
  public void serve() {
    System.out.println("🎉 향긋한 " + name + "가 완성되었습니다!");
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
