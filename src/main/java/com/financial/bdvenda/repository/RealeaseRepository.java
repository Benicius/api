package com.financial.bdvenda.repository;

import com.financial.bdvenda.domains.FinancialRelease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RealeaseRepository extends JpaRepository<FinancialRelease, Long> {}
