package com.lsoro.HexaPaymentDemo.adapters.input;

import com.lsoro.HexaPaymentDemo.domain.model.Payment;
import com.lsoro.HexaPaymentDemo.ports.input.PaymentProcessService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentProcessService paymentProcessService;

    public PaymentController(PaymentProcessService PaymentProcessService) {
        this.paymentProcessService = PaymentProcessService;
    }

    @PostMapping
    public ResponseEntity<String> createPayment(@RequestBody Payment payment) {
        paymentProcessService.doPayment(payment);
        return ResponseEntity.ok("Pago procesado exitosamente");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payment> createPayment(@PathVariable("id") Long id) {
        Payment payment = paymentProcessService.getPayment(id);
        return new ResponseEntity<>(payment, HttpStatus.OK);
    }

}
