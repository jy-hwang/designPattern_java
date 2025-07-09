package main.designPatterns.facade1;

public class Computer {
  private CPU cpu;
  private Memory memory;
  private HardDrive hardDrive;

  public Computer() {
    this.cpu = new CPU();
    this.memory = new Memory();
    this.hardDrive = new HardDrive();
  }

  public void start() {
    cpu.start();
    memory.load();
    hardDrive.read();
    cpu.execute();
    System.out.println("컴퓨터가 시작되었습니다.");
  }

}
