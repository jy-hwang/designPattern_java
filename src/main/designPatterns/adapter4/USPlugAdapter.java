package main.designPatterns.adapter4;

public class USPlugAdapter implements EuropeanPlug {

  private final USPlug usPlug;

  public USPlugAdapter(USPlug usPlug) {
    this.usPlug = usPlug;
  }

  @Override
  public void plugIntoEuropenSocket() {
    usPlug.plugIntoUSSocket();
  }

}
