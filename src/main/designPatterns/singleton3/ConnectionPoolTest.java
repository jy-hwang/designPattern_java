package main.designPatterns.singleton3;

import java.util.Calendar;

public class ConnectionPoolTest {

  public static void main(String[] args) {

    ConnectionPool instance1 = ConnectionPool.getInstance();

    ConnectionPool instance2 = ConnectionPool.getInstance();

    System.out.println(instance1);
    System.out.println(instance2);

    Calendar calendar = Calendar.getInstance();

  }

}
