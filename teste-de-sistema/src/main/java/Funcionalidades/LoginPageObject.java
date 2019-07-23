package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {

	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	// elements

	private By cadastrarCliente = By
			.cssSelector("#loginContainer > div > div.header > div > div.box_right > div > div.content-client > a");
	private By login = By.id("Login");
	private By Senha = By.id("Password");
	private By enviar = By.id("Enter");
	private By listaCasamento = By.xpath("//*[@id=\"userBox\"]/ul/li[1]/a");

	// actions

	public void cadastrarNovoCliente() {

		driver.findElement(cadastrarCliente).click();
	}

	public void dadosAcesso() {

		driver.findElement(login).sendKeys("projetotestes@gmail.com");
		driver.findElement(Senha).sendKeys("L@zaro78");
		

	}
	
	public void dadosInvalidos() {
		
		driver.findElement(login).sendKeys("testes");
		driver.findElement(Senha).sendKeys("L@zaro78");
		
	}

	public void acionarEnviar() {

		driver.findElement(enviar).click();
	}

	public void acionarListaCasamento() {

		driver.findElement(listaCasamento).click();
	}

}
