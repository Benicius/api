package com.financial.bdvenda.controller;

import com.financial.bdvenda.domains.BillsReceive;
import com.financial.bdvenda.service.BillsReceiveService;
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
@RequestMapping(value = "/launch-receive")
public class BillsReceiveController {

  @Autowired private BillsReceiveService billsReceiveService;

  @GetMapping("/billsreceive")
  public ResponseEntity<Iterable<BillsReceive>> getAllBillsReceive() {
    return new ResponseEntity<>(billsReceiveService.allBillsReceive(), HttpStatus.OK);
  }

  @GetMapping("/billsreceive/{id}")
  public ResponseEntity<Optional<BillsReceive>> getOnlyBillsReceive(
      @PathVariable(value = "id") Long id) {
    return new ResponseEntity<>(billsReceiveService.onlyBillsReceive(id), HttpStatus.OK);
  }

}
