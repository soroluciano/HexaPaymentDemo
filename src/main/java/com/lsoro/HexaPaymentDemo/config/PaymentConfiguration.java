package com.lsoro.HexaPaymentDemo.config;

import com.lsoro.HexaPaymentDemo.adapters.output.PaymentProviderDummy;
import com.lsoro.HexaPaymentDemo.application.service.PaymentProcessServiceImpl;
import com.lsoro.HexaPaymentDemo.domain.service.PaymentProvider;
import com.lsoro.HexaPaymentDemo.ports.input.PaymentProcessService;
import com.lsoro.HexaPaymentDemo.ports.output.persistence.PaymentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfiguration {


    @Bean
    public PaymentProvider paymentProvider(){
        return new PaymentProviderDummy();
    }
    @Bean
    public PaymentProcessService procesarPagoService(PaymentProvider paymentProvider, PaymentRepository paymentRepository) {
        return new PaymentProcessServiceImpl(paymentProvider,paymentRepository);
    }
}
