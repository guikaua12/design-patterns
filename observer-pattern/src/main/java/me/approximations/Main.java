package me.approximations;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        final PaymentManager paymentManager = new PaymentManager();

        paymentManager.addPaymentListener(payment -> {
            System.out.println("Payment with amount "+payment.getAmount()+" received, sending email to the customer...");
            // send email to the customer
        });

        paymentManager.addPaymentListener(payment -> {
            System.out.println("Payment with amount "+payment.getAmount()+" received, sending SMS to the customer...");
            // send SMS to the customer
        });

        paymentManager.processPayment(new Payment(UUID.randomUUID(), 50));
        printSeparator();
        paymentManager.processPayment(new Payment(UUID.randomUUID(), 500));
        printSeparator();
        paymentManager.processPayment(new Payment(UUID.randomUUID(), 10000));
    }

    private static void printSeparator() {
        System.out.println("-----------------------------");
    }
}