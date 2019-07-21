package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CentralDeAtendimentoPageObject {

	private WebDriver driver;

	public CentralDeAtendimentoPageObject(WebDriver driver) {
		this.driver = driver;
	}

	// elements

	private By digitarPergunta = By.id("neoFormAIInput");
	private By botaoPerguntar = By.xpath("//*[@id=\"neoFormAI\"]/div/button");

	// actions

	public void inserirPergunta(String string) throws InterruptedException {

		driver.findElement(digitarPergunta).sendKeys(string);
	}

	public void acionarBotaoPergunta() {

		driver.findElement(botaoPerguntar).click();
	}

}
