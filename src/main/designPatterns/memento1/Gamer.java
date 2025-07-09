package main.designPatterns.memento1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Gamer {

  private int money;

  private ArrayList<String> fruits = new ArrayList<String>();

  private Random random = new Random();

  private static String[] fruitsName = {"사과", "포도", "바나나", "귤"};

  public Gamer(int money) {
    this.money = money;
  }

  public int getMoney() {
    return money;
  }

  public void bet() {
    int dice = random.nextInt(6) + 1;
    System.out.println(dice);
    if (dice == 1) {
      money += 100;
      System.out.println("돈이 증가했습니다.");
    } else if (dice == 2) {
      money /= 2;
      System.out.println("돈이 반으로 줄었습니다.");
    } else if (dice == 6) {
      String f = getFruit();
      System.out.println("과일(" + f + ")을 받았습니다,");
      fruits.add(f);
    } else {
      System.out.println("아무일도 일어나지 않았습니다");
    }
  }

  public Memento createMemento() {
    Memento memento = new Memento(money);

    Iterator<String> ir = fruits.iterator();

    while (ir.hasNext()) {
      String f = ir.next();
      System.out.println(f);
      if (f.startsWith("good ")) {
        memento.addFruit(f);
      }
    }

    return memento;
  }

  public void restoreMemento(Memento memento) {
    this.money = memento.money;
    this.fruits = memento.fruits;
  }

  public String toString() {
    return "[money = " + money + ", fruits = " + fruits + "]";
  }

  private String getFruit() {
    String prefix = "";
    if (random.nextBoolean()) {
      prefix = "good ";
    }
    return prefix + fruitsName[random.nextInt(fruitsName.length)];
  }

}
