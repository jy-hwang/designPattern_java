package main.designPatterns.templateMethod1;

public abstract class CoffeeTemplate {
  /*
   * CoffeeTemplate 은 추상 클래스로서 알고리즘의 구조를 정의하고 하위 클래스에서 구현해야할 메서드를 선언
   * 
   * makeCoffee() 메서드를 실행하면 해당 알고리즘의 각 단계가 순서대로 수행되는 것을 확인. 이 패턴을 사용하면 알고리즘의 구조를 일반화하면서 각 단계를 하위
   * 클래스에서 유연하게 변경할 수 있음.
   * 
   */
  // 템플릿 메서드
  final void makeCoffee() {
    boilWater();
    brewCoffeeGrounds();
    pourInCup();
    addCondiments();
  }

  // 기본 구현된 메서드
  void boilWater() {
    System.out.println("Boling water");
  }

  void pourInCup() {
    System.out.println("Pouring water");
  }

  // 하위 클래스에서 구현해야 할 추상 메서드
  abstract void brewCoffeeGrounds();

  abstract void addCondiments();

}
