package main.refactoring.typecodewithsubclass.after;

public class BronzeCustomer extends Customer {

  BronzeCustomer(String customerName) {
    super(customerName);
  }

  @Override
  public String getCustomerGrade() {
    return "BRONZE";
  }

  @Override
  public int calcPrice(int price) {
    return price;
  }

  @Override
  public int calcBonusPoint(int price) {
    return bonusPoint += (price * 0.01);
  }

}
