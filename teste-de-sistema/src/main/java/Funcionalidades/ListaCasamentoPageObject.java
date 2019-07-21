package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaCasamentoPageObject {

	private WebDriver driver;

	public ListaCasamentoPageObject(WebDriver driver) {
		this.driver = driver;

	}

	// elements

	private By noiva = By.id("txtBrideName");
	private By noivo = By.id("txtGroomName");
	private By pesquisar = By.id("btnSearchGiftList");

	// actions

	public void inserirNoiva(String string) {

		driver.findElement(noiva).sendKeys(string);
	}

	public void inserirNoivo(String string) {

		driver.findElement(noivo).sendKeys(string);
	}
	
	public void acionarPesquisar() {

		driver.findElement(pesquisar).click();
	}

}
