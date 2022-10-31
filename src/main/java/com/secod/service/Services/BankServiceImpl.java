package com.secod.service.Services;


import com.secod.service.Domain.BankDomain;
import com.secod.service.Repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImpl implements BankService{

    @Autowired
    private BankRepository bankRepository;
    @Override
    public List<BankDomain> findAll() {
        List<BankDomain> allAccounts = bankRepository.findAll();
        return allAccounts;
    }

    @Override
    public String saveAccount(BankDomain accountData) {
        bankRepository.save(accountData);
        return "Account Saved";
    }

    @Override
    public String updateAccount(BankDomain newAccountData) {
//        bankRepository.save(newAccountData);
//        return "Account Info Updated";
        BankDomain existingUser = bankRepository.findById(newAccountData.getId()).orElse(null);
        if  (existingUser == null){
            return "No such user exists!!";
        }
        else {
            bankRepository.save(newAccountData);
            return "Account data updated!!";
        }

    }

    @Override
    public Optional<BankDomain> findById(Long id) {
        return bankRepository.findById(id);
    }

    @Override
    public String deleteAccount(BankDomain deleteAccountData) {
        bankRepository.delete((deleteAccountData));
        return "Account Deleted";
    }
}
