package pages;

import libraries.Annotations;

public class HomePage extends Annotations {

	public HomePage enterUsername() {
		driver.findElementByName("userName").sendKeys("susipriya");
		return this;

	}

	public HomePage enterPassword() {
		driver.findElementByName("password").sendKeys("Pass@123");
		return this;

	}

	public LoginPage clickSubmit() {
		driver.findElementByName("submit").click();
		return new LoginPage();
	}
}
