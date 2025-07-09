package main.designPatterns.strategy3;

public class StrategyExample {
  public static void main(String[] args) {
    System.out.println("=== Strategy Pattern 예제 ===");

    PaymentProcessor processor = new PaymentProcessor();
    double amount = 99.99;

    // 1. 신용카드 결제
    System.out.println("1. 신용카드 결제");
    PaymentStrategy creditCard = new CreditCardPayment("1234567890123456", "홍길동", "12/25", "123");
    processor.setPaymentStrategy(creditCard);
    processor.processPayment(amount);
  }
}
