package com.eazybytes.loans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eazybytes.loans.model.Loans;
import com.eazybytes.loans.repository.LoansRepository;

@RestController
public class LoansController {

	@Autowired
	private LoansRepository repository;

	@PostMapping("/myLoans")
	public List<Loans> getLoansDetails(@RequestBody com.eazybytes.loans.model.Customer customer) {
		List<Loans> loans = repository.findByCustomerId(customer.getCustomerId());
		return loans;
	}
}