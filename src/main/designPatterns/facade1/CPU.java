package main.designPatterns.facade1;

public class CPU {
  public void start() {
    System.out.println("CPU가 시작되었습니다.");
  }

  public void execute() {
    System.out.println("CPU가 명령어를 실행합니다.");
  }
}
