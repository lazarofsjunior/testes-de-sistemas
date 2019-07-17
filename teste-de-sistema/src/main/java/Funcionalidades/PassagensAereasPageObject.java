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
	private By destino = By.id("ember-power-select-typeahead-input-ember832");

	// actions

	public void inserirOrigem() {

		driver.findElement(origem).click();

		driver.findElement(origem).sendKeys("Recife");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("*//div[1]/div/div/div[1]/div[2]/form/div[2]/label/div/div/div[2]/div/ul/li[1]/ul/li/b")));
		element.click();

	}

	public void inserirDestino() {

		driver.findElement(destino).click();

		driver.findElement(destino).sendKeys("Rio De Janeiro");

	}

}
