package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MinhaContaPageObject {

	private WebDriver driver;

	public MinhaContaPageObject(WebDriver driver) {
		this.driver = driver;
	}

	// elements

	private By alterarDados = By.id("changeInfo");
	private By minhaListaCasamento = By.id("giftList");
	private By bairro = By.id("Neighborhood");
	private By alterarCadastro = By.xpath("//*[@id=\"changeInfos\"]/input");

	// actions

	public void acionarAlterarDados() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("changeInfo")));
		element.click();

	}

	public void acionarMinhaListaCasamento() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("giftList")));
		element.click();

	}

	public void alterarBairro() {

		driver.findElement(bairro).clear();
		driver.findElement(bairro).sendKeys("Santo Aleixoo");
	}

	public void acionarAlterarCadastro() {

		driver.findElement(alterarCadastro).click();

	}

}
