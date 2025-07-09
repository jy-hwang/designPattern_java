package main.designPatterns.templateMethod2;

public class ParisTravelPlan extends TravelPlanTemplate {
  @Override
  void planActivities() {
    System.out.println(
        "Planning activites for the Paris trip: Visit Eiffel Tower, explore Louvre Museum, enjoy French cuisine");
  }
}
