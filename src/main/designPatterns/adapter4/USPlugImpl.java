package main.designPatterns.adapter4;

public class USPlugImpl implements USPlug {

  @Override
  public void plugIntoUSSocket() {
    System.out.println("Plug into US socket");
  }

}
