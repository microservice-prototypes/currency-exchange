package org.tik.currencyexchange;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "EXCHANGE_VALUE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeValue {
    @Id
    Long id;
    @Column(name = "c_from")
    String from;
    @Column(name = "c_to")
    String to;
    @Column(name = "conversion_multiple")
    BigDecimal conversionMultiple;

    private int port;
}
