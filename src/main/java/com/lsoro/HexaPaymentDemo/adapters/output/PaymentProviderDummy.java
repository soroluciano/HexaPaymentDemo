package com.lsoro.HexaPaymentDemo.adapters.output;

import com.lsoro.HexaPaymentDemo.domain.model.Payment;
import com.lsoro.HexaPaymentDemo.domain.service.PaymentProvider;
import org.springframework.stereotype.Component;

@Component
public class PaymentProviderDummy implements PaymentProvider {
    @Override
    public boolean doPayment(Payment payment) {
        // Simulamos que el pago siempre es exitoso
        System.out.println("Simulando pago...");
        return true;
    }
}


