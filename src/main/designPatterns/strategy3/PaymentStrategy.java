package main.designPatterns.strategy3;

public interface PaymentStrategy {
  void pay(double amount);

  boolean validatePaymentDetails();
}
