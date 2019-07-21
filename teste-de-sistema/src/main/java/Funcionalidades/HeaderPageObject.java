package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPageObject {

	private WebDriver driver;

	public HeaderPageObject(WebDriver driver) {
		this.driver = driver;
	}

	// elements

	private By passagem = By.id("menu-passagens");
	private By atendimento = By.id("header-attendance");
	private By login = By.id("header-login");
	private By lojas = By.id("header-store");

	// actions

	public void acessarPasssagemAereas() {

		driver.findElement(passagem).click();
	}

	public void acessarAtendimento() {

		driver.findElement(atendimento).click();

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

	}

	public void acessarLogin() {

		driver.findElement(login).click();
		
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}

	public void acessarLojas() {

		driver.findElement(lojas).click();
	}

}
