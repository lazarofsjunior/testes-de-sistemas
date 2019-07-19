package Funcionalidades;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ValidarBebesPageObject {
	
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	
	public ValidarBebesPageObject(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 20);
	}
		
	private By escreverOrigem = By.cssSelector("input[placeholder='Cidade de origem']");
	private By escreverDestino = By.cssSelector("input[placeholder='Cidade de destino']");
	private By listaParaClicar = By.cssSelector("ul[role='listbox']");
	
	private By dataIda = By.xpath("//*[@id=\"start_date_id\"]");
	private By dataVolta = By.xpath("//*[@id=\"end_date_id\"]");

	private By adulto = By.xpath("//*[@id=\"decreaseButton\"]");
	private By bebes = By.xpath("(//[@id='increaseButton'])[1]"); //By.xpath("(//span[@class='title'])[1]")
	//private By bebes = By.cssSelector("#increaseButton:nth-of-type(2) #Layer_1");
	//private By btnAplicar = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[3]/div[2]/div/div/div/div[6]/button[2]");
	//private By btnBuscar = By.cssSelector("#root > div.jss51 > div.jss56 > div > button > span.jss193");
	
	public void inserirOrigem(String dadosOrigem) {
		driver.findElement(escreverOrigem).sendKeys(dadosOrigem);
		/*Espere aparecer elementos para poder clicar*/	
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.listaParaClicar));
		WebElement listagem = driver.findElement(this.listaParaClicar);
		listagem.findElement(By.cssSelector("li")).click();
	}
	
	public void inserirDestino(String dadosDestino) {
		driver.findElement(escreverDestino).sendKeys(dadosDestino);
		/*Espere aparecer elementos para poder clicar*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.listaParaClicar));
		WebElement listagem = driver.findElement(this.listaParaClicar);
		listagem.findElement(By.cssSelector("li")).click();
	
	}
	
	public void inserirDataIda() {
		driver.findElement(dataIda).sendKeys("24/07/19");
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.dataIda));
	}
	
	public void inserirDataVolta() {
		
		driver.findElement(dataVolta).sendKeys("30/07/19");
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.dataVolta));
	}
	
	public void seteBebes() {
		
		driver.findElement(By.id("roomsAndGuestsButton")).click();
		driver.findElement(adulto).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.adulto));
		driver.findElement(bebes).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.bebes));
		//driver.findElement(btnAplicar).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(this.btnAplicar));		
	}
	
	public void buscar() {
		//driver.findElement(btnBuscar).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(this.btnBuscar));
	}
	
	public String ImprimirMensagem() {
		
		String mensagem = driver.findElement(By.cssSelector("#ember6317 > div > header > strong")).getAttribute("value");
        System.out.println("Mensagem inválida: " + mensagem);
        return mensagem;
	}
		
}
