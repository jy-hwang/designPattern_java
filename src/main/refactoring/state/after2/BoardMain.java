package main.refactoring.state.after2;

public class BoardMain {
  public static void main(String[] args) {

    Player player = new Player();

    player.play(1);
    PlayerLevel aLevel = AdvancedLevel.getInstance();
    player.upgradeLevel(aLevel);
    player.play(2);
    PlayerLevel sLevel = SuperLevel.getInstance();
    player.upgradeLevel(sLevel);
    player.play(3);

  }

}
