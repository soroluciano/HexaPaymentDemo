package com.lsoro.HexaPaymentDemo.ports.input;

import com.lsoro.HexaPaymentDemo.domain.model.Payment;

public interface PaymentProcessService {

    void doPayment(Payment payment);

    Payment getPayment(Long id);

}
