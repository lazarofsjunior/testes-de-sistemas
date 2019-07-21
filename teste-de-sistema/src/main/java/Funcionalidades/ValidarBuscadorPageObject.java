package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidarBuscadorPageObject {
	
	/* 1- Declarar variáveis ESTÁTICAS */
	static WebDriver driver;
	static WebDriverWait wait;
	
	/*2 - Fazer o construtor e passar webdriver como parâmetro*/
	 public ValidarBuscadorPageObject(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 20);
	 }
	
	/* 3 - Declarar variaveis Private By*/
	 private By  origemInvalida = By.cssSelector("input[placeholder='Cidade de origem']");
	 private By destinoValido = By.cssSelector("input[placeholder='Cidade de destino']");
	 private By listaParaClicar = By.cssSelector("ul[role='listbox']");
	 private By dataIda = By.xpath("//*[@id=\"start_date_id\"]");
	 private By dataVolta = By.xpath("//*[@id=\"end_date_id\"]");
	 private By passareiro = By.xpath("//*[@id=\"decreaseButton\"]");
	 private By btnBuscar = By.cssSelector("#root > div.jss51 > div.jss56 > div > button > span.jss193");
	 
	 
	 public void origemInvalida(String dadosOrigem) {
			driver.findElement(origemInvalida).sendKeys(dadosOrigem);
		    
		}
	 public void inserirDestino() {
			driver.findElement(destinoValido).sendKeys("Recife");	
			wait.until(ExpectedConditions.visibilityOfElementLocated(this.listaParaClicar));
			WebElement listagem = driver.findElement(this.listaParaClicar);
			listagem.findElement(By.cssSelector("li")).click();			
		}
	 
	 public void inserirDataIda() {
			driver.findElement(dataIda).sendKeys("30/07/19");
			wait.until(ExpectedConditions.visibilityOfElementLocated(this.dataIda));
		}
	 
	 public void inserirDataVolta() {
			
			driver.findElement(dataVolta).sendKeys("05/08/19");
			wait.until(ExpectedConditions.visibilityOfElementLocated(this.dataVolta));
		}
	 
	 public void inserirPassageiro() {
			
			driver.findElement(By.id("roomsAndGuestsButton")).click();
			driver.findElement(passareiro).click();
				
		}
	 
	 public void clicarBuscarParaMensagemAparecer() {
		 driver.findElement(btnBuscar).click();
	 }
			
}