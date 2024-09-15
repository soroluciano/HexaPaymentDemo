package com.lsoro.HexaPaymentDemo.adapters.output.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepositoryJPA extends JpaRepository<PaymentEntity, Long> {

}
