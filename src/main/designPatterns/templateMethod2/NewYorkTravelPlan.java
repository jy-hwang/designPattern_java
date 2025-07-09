package main.designPatterns.templateMethod2;

public class NewYorkTravelPlan extends TravelPlanTemplate {
  @Override
  void planActivities() {
    System.out.println(
        "Planning activites for the New York trip: Explore museums, visit Central Park, enjoy Boradway shows");
  }
}
