package com.lsoro.HexaPaymentDemo.application.service;

import com.lsoro.HexaPaymentDemo.domain.model.Payment;
import com.lsoro.HexaPaymentDemo.domain.service.PaymentProvider;
import com.lsoro.HexaPaymentDemo.ports.input.PaymentProcessService;
import com.lsoro.HexaPaymentDemo.ports.output.persistence.PaymentRepository;

public class PaymentProcessServiceImpl implements PaymentProcessService {

    private final PaymentProvider paymentProvider;
    private final PaymentRepository paymentRepository;


    public PaymentProcessServiceImpl(PaymentProvider paymentProvider, PaymentRepository paymentRepository){
        this.paymentProvider = paymentProvider;
        this.paymentRepository = paymentRepository;

    }

    @Override
    public void doPayment(Payment payment) {
        boolean paymentSuccess = paymentProvider.doPayment(payment);
        if(paymentSuccess){
            System.out.println("Paid");
            paymentRepository.savePayment(payment);
        }else{
            System.out.println("not Paid");
        }

    }

    @Override
    public Payment getPayment(Long id) {
        return paymentRepository.getPayment(id);
    }

}
