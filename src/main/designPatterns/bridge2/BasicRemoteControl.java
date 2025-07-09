package main.designPatterns.bridge2;

public class BasicRemoteControl implements RemoteControl {

  protected TV tv;

  public BasicRemoteControl(TV tv) {
    this.tv = tv;
  }

  @Override
  public void powerOn() {
    tv.turnOn();
  }

  @Override
  public void powerOff() {
    tv.turnOff();
  }

  @Override
  public void setChannel(int channel) {
    tv.setChannel(channel);
  }

}
