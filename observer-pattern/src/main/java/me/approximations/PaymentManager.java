package me.approximations;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {
    private final List<PaymentListener> paymentListeners = new ArrayList<>();

    public void processPayment(Payment payment) {
       // ...

        // notify the listeners
        for (PaymentListener paymentListener : paymentListeners) {
            paymentListener.paymentProcessed(payment);
        }
    }

    public void addPaymentListener(PaymentListener paymentListener) {
        paymentListeners.add(paymentListener);
    }

    public void removePaymentListener(PaymentListener paymentListener) {
        paymentListeners.remove(paymentListener);
    }
}
