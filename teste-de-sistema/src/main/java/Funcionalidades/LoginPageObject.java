package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {
	
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	//elements
	
	private By cadastrarCliente = By
			.cssSelector("#loginContainer > div > div.header > div > div.box_right > div > div.content-client > a");
	
	//actions

	
	public void cadastrarNovoCliente() {

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		driver.findElement(cadastrarCliente).click();
	}
}
