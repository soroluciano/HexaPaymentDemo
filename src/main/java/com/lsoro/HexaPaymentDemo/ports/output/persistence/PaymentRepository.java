package com.lsoro.HexaPaymentDemo.ports.output.persistence;

import com.lsoro.HexaPaymentDemo.domain.model.Payment;

public interface PaymentRepository {

    void savePayment(Payment payment);

    Payment getPayment(Long id);
}
