package com.jerseyexample.api;

import java.security.SecureRandom;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/account")
public class AccountApiService {
	
	private static final Logger logger = Logger.getLogger(AccountApiService.class);
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public double getBalance(@QueryParam("accountNo") String accountNo) {
		logger.info("Extracting the info for accountNo: " + accountNo);
		SecureRandom random = new SecureRandom();
		double balance = random.nextDouble() *1000 ;
		return balance;
	}
	
}
