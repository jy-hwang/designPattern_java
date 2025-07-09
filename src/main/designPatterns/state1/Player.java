package main.designPatterns.state1;

public class Player {
  private PlayerLevel level;
  // int level = 1;

  public Player() {
    level = new BeginnerLevel();
    level.showLevelMessage();
    // level = 1;
  }

  public void upgradeLevel(PlayerLevel level) {
    level.showLevelMessage();
    this.level = level;
    // level++;
  }

  public PlayerLevel getPlayerLevel() {
    return level;
  }

  public void play(int count) {
    run();
    for (int i = 0; i < count; i++) {
      jump();
    }
    turn();
  }

  public void run() {
    level.run();
  }

  public void jump() {
    level.jump();
  }

  public void turn() {
    level.turn();
  }
}
