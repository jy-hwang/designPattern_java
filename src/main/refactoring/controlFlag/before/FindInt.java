package main.refactoring.controlFlag.before;

public class FindInt {
  public static boolean find(int[] data, int number) {
    boolean flag = false;

    for (int i = 0; i < data.length; i++) {
      if (data[i] == number) {
        flag = true;
      }
      System.out.println(data[i] + "  " + flag);
    }

    return flag;
  }
}
