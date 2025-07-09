package main.designPatterns.strategy3;

public class CreditCardPayment implements PaymentStrategy {

  private String cardNumber;
  private String cardHolderName;
  private String expiryDate;
  private String cvv;

  public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate,
      String cvv) {
    this.cardNumber = cardNumber;
    this.cardHolderName = cardHolderName;
    this.expiryDate = expiryDate;
    this.cvv = cvv;
  }

  @Override
  public boolean validatePaymentDetails() {
    System.out.println("신용카드 정보 검증 중...");

    return cardNumber != null && cardNumber.length() == 16 && cvv != null && cvv.length() == 3;
  }

  @Override
  public void pay(double amount) {
    if (validatePaymentDetails()) {
      System.out.println("신용카드로 $" + amount + " 결제 완료");
      System.out.println("카드 번호 : " + cardNumber.substring(0, 4) + "****");
    } else {
      System.out.println("신용카드 정보가 유효하지 않습니다.");
    }
  }

}
