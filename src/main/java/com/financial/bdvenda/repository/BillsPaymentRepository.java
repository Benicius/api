package com.financial.bdvenda.repository;

import com.financial.bdvenda.domains.BillsPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BillsPaymentRepository extends JpaRepository<BillsPayment, Long> {}
