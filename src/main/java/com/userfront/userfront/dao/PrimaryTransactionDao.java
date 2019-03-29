package com.userfront.userfront.dao;

import java.util.List;

import com.userfront.userfront.domain.PrimaryTransaction;
import org.springframework.data.repository.CrudRepository;



public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
