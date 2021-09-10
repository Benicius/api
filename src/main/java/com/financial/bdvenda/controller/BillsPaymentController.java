package com.financial.bdvenda.controller;

import com.financial.bdvenda.domains.BillsPayment;
import com.financial.bdvenda.service.BillsPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/launch-payment")
public class BillsPaymentController {

  @Autowired private BillsPaymentService billsPaymentService;

  @GetMapping("/billspayment")
  public ResponseEntity<Iterable<BillsPayment>> getAllBillsPayment() {
    return new ResponseEntity<>(billsPaymentService.listBillsPayment(), HttpStatus.OK);
  }

  @GetMapping("/billspayment/{id}")
  public ResponseEntity<Optional<BillsPayment>> getOnlyBillsPayment(
      @PathVariable(value = "id") Long id) {
    return new ResponseEntity<>(billsPaymentService.onlyBillsPayment(id), HttpStatus.OK);
  }

}
