package main.refactoring.magicNumber.after;

public class Robot {

  public static final int COMMAND_WALK = 0;
  public static final int COMMAND_STOP = 1;
  public static final int COMMAND_JUMP = 2;

  public static final int ZERO = 0;

  public enum Command {
    WALK, STOP, JUMP
  }

  public String name;

  public Robot(String name) {
    this.name = name;
  }

  public void order(Command command) {
    if (command == Command.WALK) {// 걷기
      System.out.println(name + " walk");
    } else if (command == Command.STOP) {// 멈추기
      System.out.println(name + " stop");
    } else if (command == Command.JUMP) {// 제자리 뛰기
      System.out.println(name + " jump");
    } else {
      System.out.println("error");
    }
  }

}
