package com.isf.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isf.model.db.UserBankLink;

@Repository
public interface UserBankLinkRepository extends JpaRepository<UserBankLink, Integer> {
}
