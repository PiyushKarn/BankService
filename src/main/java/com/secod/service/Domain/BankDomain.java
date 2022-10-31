package com.secod.service.Domain;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@DynamicUpdate
@Table(name="accounts")

public class BankDomain {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String userId;
    @Column
    private String bankName;
    @Column
    private String accountNumber;
    @Column
    private String ifscCode;
    @Column(columnDefinition = "TEXT")
    private String additionalDetails;

    public BankDomain()
    {}

    public BankDomain(Long id, String userId, String bankName,String accountNumber, String ifscCode, String additionalDetails)
    {
        this.id = id;
        this.userId =userId;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.additionalDetails = additionalDetails;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }
}
