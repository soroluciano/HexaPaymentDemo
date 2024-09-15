package com.lsoro.HexaPaymentDemo.ports.input;

import com.lsoro.HexaPaymentDemo.domain.model.Payment;

public interface PaymentProcessService {

    public void doPayment(Payment payment);

    Payment getPayment(Long id);

}
