package main.designPatterns.singleton3;

public class ConnectionPool {

  private static ConnectionPool instance = new ConnectionPool();

  private ConnectionPool() {}// 기본 생성자의 경우 public 이므로 private 으로 제한해야함.

  public static ConnectionPool getInstance() {

    if (instance == null) {// 방어적 코드
      instance = new ConnectionPool();
    }
    return instance;
  }

}
