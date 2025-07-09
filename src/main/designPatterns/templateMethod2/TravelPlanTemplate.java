package main.designPatterns.templateMethod2;

public abstract class TravelPlanTemplate {
  /*
   * 여행을 세우는 과정을 템플릿 메서드로 정의하고 각각의 하위 클래스에서 특정한 도시의 여행 계획을 구체적으로 구현
   */
  // 템플릿 메서드
  final void planTravel() {
    chooseDestination();
    bookTickets();
    planActivities();
    packBags();
  }

  // 기본 구현된 메서드
  void chooseDestination() {
    System.out.println("Choosing a destination for the trip");
  }

  void bookTickets() {
    System.out.println("Booking flight and accommodation");
  }

  void packBags() {
    System.out.println("Packing bags for the trip");
  }

  // 하위 클래스에서 구현해야할 추상 메서드
  abstract void planActivities();
}
