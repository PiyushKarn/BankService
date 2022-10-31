package com.secod.service.Controllers;

import java.util.List;
import java.util.Optional;


import com.secod.service.Domain.BankDomain;
import com.secod.service.Services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")

public class BankController {
    @Autowired
    private BankService bankServices;

    @GetMapping() //getAllAccounts
    public List<BankDomain> allAccounts() {
        return bankServices.findAll();

    }

    @PostMapping()  //AddNewAccount
    public String addAccount(@RequestBody BankDomain accountData) {
        return bankServices.saveAccount(accountData);
    }

    @PutMapping()   //updateExistingAccount
    public String updateUser(@RequestBody BankDomain newAccountData) {
        return bankServices.updateAccount(newAccountData);
    }

    @GetMapping("/{id}")    //findAccountById
    public Optional<BankDomain> getAccountById(@PathVariable Long id) {

        Optional<Optional<BankDomain>> bankDomain = Optional.ofNullable(bankServices.findById(id));

        return bankDomain.get();
    }


    @DeleteMapping()       //deleteUserById
    public String deleteUser(@RequestBody BankDomain deleteAccountData) {
        return bankServices.deleteAccount(deleteAccountData);
    }
}
