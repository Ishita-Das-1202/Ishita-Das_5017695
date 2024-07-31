package com.example.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String name, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }
}
