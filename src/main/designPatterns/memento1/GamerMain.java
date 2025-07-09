package main.designPatterns.memento1;

import java.util.ArrayList;

public class GamerMain {
  public static void main(String[] args) {

    Gamer gamer = new Gamer(100);

    Memento memento = gamer.createMemento();

    ArrayList<Memento> history = new ArrayList<Memento>();
    for (int i = 0; i < 20; i++) {
      System.out.println("====" + i);
      System.out.println("현 상태 : " + gamer);

      gamer.bet();

      System.out.println("돈은 " + gamer.getMoney() + " 원이 되었습니다.");

      // Memento
      if (gamer.getMoney() > memento.getMoney()) {
        System.out.println("돈이 많이 증가했으니 현재의 상태를 보존해두자");
        memento = gamer.createMemento();
        history.add(memento);
      } else if (gamer.getMoney() < memento.getMoney() / 2) {
        System.out.println("돈이 많이 줄었으니 이전의 상태로 복귀하자");
        gamer.restoreMemento(memento);
      }

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
      System.out.println();
    }

  }
}
