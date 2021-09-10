package com.financial.bdvenda.domains;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorColumn(name = "bills_pay")
public class BillsPayment extends Account {

  private LocalDate paymentDate;

  public LocalDate getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }
}
