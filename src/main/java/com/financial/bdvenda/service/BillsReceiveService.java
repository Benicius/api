package com.financial.bdvenda.service;

import com.financial.bdvenda.domains.BillsReceive;
import com.financial.bdvenda.repository.BillsReceiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillsReceiveService {

  private BillsReceiveRepository billsReceiveRepository;

  @Autowired
  public BillsReceiveService(
      BillsReceiveRepository billsReceiveRepository){
    this.billsReceiveRepository = billsReceiveRepository;
  }

  public Iterable<BillsReceive> allBillsReceive() {
    return billsReceiveRepository.findAll();
  }

  public Optional<BillsReceive> onlyBillsReceive(Long id) {
    return billsReceiveRepository.findById(id);
  }

}
