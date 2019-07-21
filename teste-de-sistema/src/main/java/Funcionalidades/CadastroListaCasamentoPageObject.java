package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroListaCasamentoPageObject {

	private WebDriver driver;

	public CadastroListaCasamentoPageObject(WebDriver driver) {
		this.driver = driver;
	}

	// elements

	private By noiva = By.id("txtBrideName");
	private By emailNoiva = By.id("txtBrideEmail");
	private By dataNascNoiva = By.id("txtBrideBirth");
	private By noivo = By.id("txtGroomName");
	private By emailNoivo = By.id("txtGroomEmail");
	private By dataNascNoivo = By.id("txtGroomBirth");
	private By localEvento = By.id("txtEventPlace");
	private By dataEvento = By.id("txtEventDate");
	private By horario = By.id("txtEventTime");
	private By regulamento = By.xpath("//*[@id=\"chkRegulamento\"]");
	private By compromisso = By.xpath("//*[@id=\"chkCompromisso\"]");
	private By criarLista = By.id("submitGiftList");
	private By listaCriada = By.xpath("//*[@id=\"eventDetail\"]/h2");

	// actions

	public void camposObrigatorios() {

		driver.findElement(noiva).sendKeys("Luana");
		driver.findElement(emailNoiva).sendKeys("luana@hotmail.com");
		driver.findElement(dataNascNoiva).sendKeys("02091991");
		driver.findElement(noivo).sendKeys("Lucas");
		driver.findElement(emailNoivo).sendKeys("lucas@gmail.com");
		driver.findElement(dataNascNoivo).sendKeys("02091991");
		driver.findElement(localEvento).sendKeys("Recife");
		driver.findElement(dataEvento).sendKeys("09122022");
		driver.findElement(horario).sendKeys("1200");
		driver.findElement(regulamento).click();
		driver.findElement(compromisso).click();

	}

	public void acionarCriarLista() {

		driver.findElement(criarLista).click();
	}

	public void exibirListaCriada() {

		System.out.println(driver.findElement(listaCriada).getText());
	}

}
