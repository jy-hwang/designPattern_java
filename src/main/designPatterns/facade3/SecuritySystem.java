package main.designPatterns.facade3;

public class SecuritySystem {
  public void activate() {
    System.out.println("보안 시스템이 활성화되었습니다.");
  }

  public void deactivate() {
    System.out.println("보안 시스템이 비활성화되었습니다.");
  }
}
