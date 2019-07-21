package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IncluirListaConvidadosPageObject {
	private WebDriver driver;
	
	public IncluirListaConvidadosPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	// elements
	
	private By nomeConvidado = By.id("txtNewGuestName");
	private By parentescoConvidado = By.id("txtNewGuestParent");
	private By emailConvidado = By.id("txtNewGuestEmail");
	private By dddConvidado = By.id("txtNewGuestDDD");
	private By telefoneConvidado = By.id("txtNewGuestPhoneNumber");
	private By incluirLista = By.id("btnNewGuestSubmit");
	
	// actions
	
	public void camposObrigatoriosConvidados() {
	
	driver.findElement(nomeConvidado).sendKeys("Larissa");
	driver.findElement(parentescoConvidado).sendKeys("filha");
	driver.findElement(emailConvidado).sendKeys("thiagoctr@gmail.com");
	driver.findElement(dddConvidado).sendKeys("81");
	driver.findElement(telefoneConvidado).sendKeys("96852794");
	}
	
	public void enviarIncluirConvidado() {

		driver.findElement(incluirLista).click();
	}
}
