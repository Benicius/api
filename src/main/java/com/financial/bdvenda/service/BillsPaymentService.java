package com.financial.bdvenda.service;

import com.financial.bdvenda.domains.BillsPayment;
import com.financial.bdvenda.repository.BillsPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillsPaymentService {

  private BillsPaymentRepository billsPaymentRepository;

  @Autowired
  public BillsPaymentService(
      BillsPaymentRepository billsPaymentRepository){
    this.billsPaymentRepository = billsPaymentRepository;
  }

  public Iterable<BillsPayment> listBillsPayment() {
    return billsPaymentRepository.findAll();
  }

  public Optional<BillsPayment> onlyBillsPayment(Long id) {
    return billsPaymentRepository.findById(id);
  }
}
