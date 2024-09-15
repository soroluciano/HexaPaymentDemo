package com.lsoro.HexaPaymentDemo.adapters.output.persistence;

import com.lsoro.HexaPaymentDemo.domain.model.Payment;
import com.lsoro.HexaPaymentDemo.ports.output.persistence.PaymentRepository;
import org.springframework.stereotype.Component;

@Component
public class PaymentRepositoryAdapter implements PaymentRepository {

    private PaymentRepositoryJPA paymentRepositoryJPA;

    public PaymentRepositoryAdapter(PaymentRepositoryJPA paymentRepositoryJPA) {
        this.paymentRepositoryJPA = paymentRepositoryJPA;
    }

    @Override
    public void savePayment(Payment payment) {
        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setQuantity(payment.getQuantity());
        paymentEntity.setCurrency(payment.getCurrency());
        paymentEntity.setState(payment.getState());
        paymentRepositoryJPA.save(paymentEntity);
    }

    @Override
    public Payment getPayment(Long id) {
        PaymentEntity paymentEntity = paymentRepositoryJPA.getReferenceById(id);
        Payment payment = new Payment();
        payment.setCurrency(paymentEntity.getCurrency());
        payment.setQuantity(paymentEntity.getQuantity());
        payment.setState(paymentEntity.getState());
        return payment;
    }

}
