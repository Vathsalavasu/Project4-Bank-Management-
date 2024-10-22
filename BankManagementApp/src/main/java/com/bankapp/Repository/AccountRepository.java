package com.bankapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long > {

}
