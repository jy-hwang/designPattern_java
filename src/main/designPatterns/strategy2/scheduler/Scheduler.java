package main.designPatterns.strategy2.scheduler;

public interface Scheduler {

  public void getNextCall();

  public void sendCallToAgent();

}
