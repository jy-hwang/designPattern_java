package main.designPatterns.strategy3;

public class PaymentProcessor {
  private PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public PaymentStrategy getPaymentStrategy() {
    return paymentStrategy;
  }

  public void processPayment(double amount) {
    if (paymentStrategy == null) {
      System.out.println("결제 방법이 선택되지 안았습니다.");
      return;
    }

    System.out.println("결제 처리 시작...");
    paymentStrategy.pay(amount);
    System.out.println("결제 처리 완료\n");
  }

}
