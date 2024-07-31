
package com.example.adapter;

public class StripePaymentAdapter implements PaymentProcessor {
    private StripePayment stripePayment;

    public StripePaymentAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void processPayment(double amount) {
        stripePayment.sendPayment(amount);
    }
}
