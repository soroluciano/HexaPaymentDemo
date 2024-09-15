package com.lsoro.HexaPaymentDemo.domain.service;

import com.lsoro.HexaPaymentDemo.domain.model.Payment;

public interface PaymentProvider {

    boolean doPayment(Payment payment);
}
