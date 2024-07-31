package com.example.strategy;

public class StrategyPatternTest {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using credit card
        PaymentStrategy creditCard = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23");
        context.setPaymentStrategy(creditCard);
        context.executePayment(250);

        // Pay using PayPal
        PaymentStrategy payPal = new PayPalPayment("johndoe@example.com", "password");
        context.setPaymentStrategy(payPal);
        context.executePayment(450);
    }
}
