package com.isf.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isf.model.db.BankDetails;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails, Integer> {
}
