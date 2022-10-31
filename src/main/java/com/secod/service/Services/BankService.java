package com.secod.service.Services;


import com.secod.service.Domain.BankDomain;

import java.util.List;
import java.util.Optional;

public interface BankService {
    List<BankDomain> findAll();

    String saveAccount(BankDomain accountData);

    String updateAccount(BankDomain newAccountData);

   // Optional<BankDomain> findById(Long id);

    Optional<BankDomain> findById(Long id);

    String deleteAccount(BankDomain deleteAccountData);
}
