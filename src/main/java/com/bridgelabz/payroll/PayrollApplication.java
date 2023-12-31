package com.bridgelabz.payroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class PayrollApplication {

	public static void main(String[] args) {

		SpringApplication.run(PayrollApplication.class, args);
		log.info("Employee Payroll App started");
	}

}
