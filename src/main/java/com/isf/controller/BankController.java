package com.isf.controller;

import com.isf.model.db.BankDetails;
import com.isf.model.db.UserBankLink;
import com.isf.repo.BankDetailsRepository;
import com.isf.repo.UserBankLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//http://localhost:8080/user/bank/fetch
@RestController
@RequestMapping("/user/bank")
public class BankController {

    @Autowired
    private BankDetailsRepository bankDetailsRepository;

    @Autowired
    private UserBankLinkRepository userBankLinkRepository;
    //http://localhost:8080/user/bank/add
    @PostMapping("/add")
    public String addBankDetails(@RequestBody BankDetails bankDetails) {
            UserBankLink userBankLink = new UserBankLink();
            //userBankLink.setUsId(1L);
            userBankLink.setBkId(bankDetails.getBkId());
            userBankLinkRepository.save(userBankLink);
            bankDetailsRepository.save(bankDetails);
            return "Bank Details Added";
    }
    //http://localhost:8080/user/bank/fetch
    @GetMapping("/fetch")
    public List<BankDetails> getBankDetails() {
            return bankDetailsRepository.findAll();
        }
}
