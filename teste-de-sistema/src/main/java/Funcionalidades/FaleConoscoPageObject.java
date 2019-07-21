package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaleConoscoPageObject {
	
	
	static WebDriver driver;
	static WebDriverWait wait;
	//static String faleConoscoURL = "https://www.cvc.com.br/atendimento/central-de-atendimento.aspx";
	static String atendimentoURL= "https://www.cvc.com.br/atendimento/fale-conosco.aspx";
	
	
	
	public FaleConoscoPageObject(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 20);
		
	}
	
	/*Element Locations com By em PRIVATE*/

	//private By btnAtendimento = By.cssSelector("#root > header > div > ul > li:nth-child(2) > a");
	//private By btnfaleConosco = By.cssSelector("div.footer-bloco footer-bloco-base > div.bottomBlock > div:nth-child(4) > a.controlEM.active.btn-footer-a > div");
	private By assunto = By.id("assunto");
	private By nome = By.xpath("//*[@id=\"faleConoscoForm\"]/div[1]/label[2]/input");
	private By reserva = By.id("reservationCode");
	private By email = By.id("email");
	private By cpf = By.id("documentNumber");
	private By telefone = By.id("phone1");
	//celular deverá ficar em branco
	private By mensagem = By.id("message");
	private By btnEnviar = By.cssSelector("a#btn_enviar_msg.btn_confirm");
	
	public void clicarAtendimento() {
		//driver.findElement(btnAtendimento);
	}
	public void clicarFaleConosco() {
		//driver.findElement(btnfaleConosco);
	}
	
	public void preencherFormulario() {
		//Paleativo
		driver.get(atendimentoURL);
		//Assunto não preencherá nada
		driver.findElement(assunto).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.assunto));
		driver.findElement(assunto).click();
		driver.findElement(nome).sendKeys("Edi Silva");
		driver.findElement(reserva).sendKeys("11111");
		driver.findElement(email).sendKeys("abc@def.gh");
		driver.findElement(cpf).sendKeys("11111111111");
		driver.findElement(telefone).sendKeys("11111111111");
		//celular deverá ficar em branco
		driver.findElement(mensagem).sendKeys("akjxabsxnj habxdakjgbdn");
		
	}
	
	public void clicarEnviarMensagem() {
		driver.findElement(btnEnviar).click();
	}
	//public String pegarMensagem() {
		
		//ESTE CÓDIGO NÃO PÔDE SER IMPLEMENTADO
		//String mensagem = driver.findElement(By.cssSelector("")).getAttribute("value");
        //System.out.println("Mensagem de dados inválidos: " + mensagem);
        //return mensagem;
	//}
}
