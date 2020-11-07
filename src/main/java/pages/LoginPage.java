package pages;

import org.testng.Assert;

import libraries.Annotations;

public class LoginPage extends Annotations {

	public LoginPage validateUser() {
		String actualText = driver.findElementByTagName("h3").getText();
		System.out.println("Actual Text : " + actualText);
		Assert.assertEquals(actualText, "Login Successfully");
		resultList.add("2,           Login to the site,      User should be able to login,      User logged in,     Pass");
		resultList.add("  ");
				return this;

	}

}
