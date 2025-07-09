package main.designPatterns.builder1;

public interface MakeReport {

  public void MakeHeader();

  public void MakeBody();

  public void MakeFooter();

  public String getReport();

  // 이를 구현하여 TextReport, HTMLReport 등을 생성할 수 있음.

}
