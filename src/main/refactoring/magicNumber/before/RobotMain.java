package main.refactoring.magicNumber.before;

public class RobotMain {

  public static void main(String[] args) {
    Robot robot = new Robot("Tomas");

    robot.order(0);// walk
    robot.order(1);
    robot.order(2);

    robot.order(100);


  }

}
