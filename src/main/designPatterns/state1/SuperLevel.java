package main.designPatterns.state1;

public class SuperLevel extends PlayerLevel {

  @Override
  public void run() {
    System.out.println("아무 빠르게 달립니다");
  }

  @Override
  public void jump() {
    System.out.println("엄청 높이 Jump 합니다.");
  }

  @Override
  public void turn() {
    System.out.println("한 바퀴 돕니다.");
  }

  @Override
  public void showLevelMessage() {
    System.out.println("*** 고급자 레벨 입니다 ***");
  }

  @Override
  public void fly() {
    System.out.println("멀리 날아갑니다.");
  }
}
