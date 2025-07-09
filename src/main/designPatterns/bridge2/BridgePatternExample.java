package main.designPatterns.bridge2;

public class BridgePatternExample {
  public static void main(String[] args) {
    TV sonyTV = new SonyTV();

    RemoteControl remoteControl = new BasicRemoteControl(sonyTV);
    remoteControl.powerOn();
    remoteControl.setChannel(5);
    remoteControl.powerOff();
  }
}
