package main.refactoring.typecodewithsubclass.after;

public class CustomerMain {

  public static void main(String[] args) {
    Customer bronzeCustomer = new BronzeCustomer("Tomas");
    Customer silverCustomer = new SilverCustomer("Alice");
    Customer goldCustomer = new GoldCustomer("Edward");

    int price = 10000;

    System.out.println(bronzeCustomer);
    System.out
        .println(bronzeCustomer.getCustomerName() + " : price : " + bronzeCustomer.calcPrice(price)
            + ", bonusPoint : " + bronzeCustomer.calcBonusPoint(price));

    System.out.println(silverCustomer);
    System.out
        .println(silverCustomer.getCustomerName() + " : price : " + silverCustomer.calcPrice(price)
            + ", bonusPoint : " + silverCustomer.calcBonusPoint(price));

    System.out.println(goldCustomer);
    System.out.println(goldCustomer.getCustomerName() + " : price : "
        + goldCustomer.calcPrice(price) + ", bonusPoint : " + goldCustomer.calcBonusPoint(price));
  }

}
