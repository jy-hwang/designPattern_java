package main.designPatterns.templateMethod2;

public class TemplateMethodPatternExample {
  public static void main(String[] args) {
    // 뉴욕 여행 계획 수립
    TravelPlanTemplate newYorkTrip = new NewYorkTravelPlan();
    System.out.println("New Yrok Trip plan");
    newYorkTrip.planTravel();

    // 파리 여행 계획 수립
    TravelPlanTemplate parisTrip = new ParisTravelPlan();
    System.out.println("Paris Trip plan");
    parisTrip.planTravel();

  }
}
