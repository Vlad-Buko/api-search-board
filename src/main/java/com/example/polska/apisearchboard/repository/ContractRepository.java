package com.example.polska.apisearchboard.repository;

import com.example.polska.apisearchboard.entity.Contract;
import com.example.polska.apisearchboard.enumeration.ContractEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
    Contract findByContract(ContractEnum contractEnum);
}
