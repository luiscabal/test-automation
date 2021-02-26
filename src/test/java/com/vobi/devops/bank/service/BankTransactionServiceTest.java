package com.vobi.devops.bank.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vobi.devops.bank.dto.DepositDTO;
import com.vobi.devops.bank.dto.TransactionResultDTO;

@SpringBootTest
class BankTransactionServiceTest {

	@Autowired
	private BankTransactionServiceImpl bankTransactionService;
	
	@Test
	void deposit_debe_depositar_dinero_en_cuenta() throws Exception {
		
		// Arrange
		String accountId = "4640-0341-9387-5781";
		String userEmail = "cfaier0@cafepress.com";
		Double amount = 15000.0;

		TransactionResultDTO transactionResultDTO = null;

		DepositDTO depositDTO = new DepositDTO(accountId, amount, userEmail);

		//Act
		transactionResultDTO = bankTransactionService.deposit(depositDTO);

		// Assert
		assertNotNull(transactionResultDTO);
	}

}
