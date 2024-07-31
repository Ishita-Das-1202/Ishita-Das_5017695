package com.example.adapter;

public class AdapterPatternTest {

    public static void main(String[] args) {
        // Use PayPal payment through adapter
        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentProcessor payPalAdapter = new PayPalPaymentAdapter(payPalPayment);
        payPalAdapter.processPayment(100.0);

        // Use Stripe payment through adapter
        StripePayment stripePayment = new StripePayment();
        PaymentProcessor stripeAdapter = new StripePaymentAdapter(stripePayment);
        stripeAdapter.processPayment(200.0);
    }
}
