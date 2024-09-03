package com.aline.paymentservice.service;

import com.aline.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
