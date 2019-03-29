package com.userfront.userfront.dao;

import java.util.List;

import com.userfront.userfront.domain.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;



public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

