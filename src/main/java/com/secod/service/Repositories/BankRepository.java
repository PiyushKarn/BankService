package com.secod.service.Repositories;

import com.secod.service.Domain.BankDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankRepository extends JpaRepository<BankDomain, Long> {


}
