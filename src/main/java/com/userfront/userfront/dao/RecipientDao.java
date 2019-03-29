package com.userfront.userfront.dao;

import java.util.List;

import com.userfront.userfront.domain.Recipient;
import org.springframework.data.repository.CrudRepository;



public interface RecipientDao extends CrudRepository<Recipient, Long> {
    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
