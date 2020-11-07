package tests;

import org.testng.annotations.Test;

import libraries.Annotations;
import pages.HomePage;

@Test
public class TC001_ValidateUserCredential extends Annotations{

	public void validateCredential() {
		new HomePage()
		.enterUsername()
		.enterPassword()
		.clickSubmit()
		.validateUser();
		

	}
}
