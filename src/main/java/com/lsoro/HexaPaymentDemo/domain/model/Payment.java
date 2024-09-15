package com.lsoro.HexaPaymentDemo.domain.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private double quantity;
    private String currency;
    private String state;

}
