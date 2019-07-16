package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PassagensAereasPageObject {

	private WebDriver driver;

	public PassagensAereasPageObject(WebDriver driver) {
		this.driver = driver;
	}

	// elements

	private By origem = By.id("ember-power-select-typeahead-input-ember799");
	private By selecionarOrigem = By.xpath("//*[@id=\"ember-power-select-options-ember793\"]/li[1]/ul/li[1]");
	private By destino = By.id("ember-power-select-typeahead-input-ember832");

	// actions

	public void inserirOrigem() {

		driver.findElement(origem).click();

		driver.findElement(origem).sendKeys("Recife");

		WebElement incluirrOrigem = driver.findElement(selecionarOrigem);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(incluirrOrigem));

		incluirrOrigem.click();

	}
	
	public void inserirDestino() {

		driver.findElement(destino).click();

		driver.findElement(destino).sendKeys("Rio De Janeiro");

	}

}
