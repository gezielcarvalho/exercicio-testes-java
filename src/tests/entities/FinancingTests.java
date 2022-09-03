package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void constructor_should_create_object_when_valid_data() {
		//Arrange 
		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		Double expectedEntry = 20000.0;
		Double expectedQuota = 1000.0;
		//Act
		Financing financing = new Financing(totalAmount, income, months);
		//Assert
		Assertions.assertNotNull(financing);
		Assertions.assertEquals(expectedEntry, financing.entry());
		Assertions.assertEquals(expectedQuota, financing.quota());
	}
	
	@Test
	public void constructor_should_throw_error_when_invalid_data() {
		//Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//Arrange 
			Double totalAmount = 100000.0;
			Double income = 2000.0;
			Integer months = 20;
			// Act 			
			new Financing(totalAmount, income, months);
		});
	}

}
