package main.refactoring.magicNumber.after;

public class RobotMain {

  public static void main(String[] args) {
    Robot robot = new Robot("Tomas");

    robot.order(Robot.Command.WALK);
    robot.order(Robot.Command.STOP);
    robot.order(Robot.Command.JUMP);

    // robot.order();


  }

}
