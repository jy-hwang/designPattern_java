package main.designPatterns.state1;

public abstract class PlayerLevel {

  public abstract void run();

  public abstract void jump();

  public abstract void turn();

  public abstract void showLevelMessage();

  public void fly() {}// 훅 메서드

  // final public void go(int count) {
  //
  // }
}
