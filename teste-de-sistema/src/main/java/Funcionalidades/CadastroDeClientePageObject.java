package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroDeClientePageObject {

	private WebDriver driver;

	public CadastroDeClientePageObject(WebDriver driver) {
		this.driver = driver;
	}

	// elements

	private By primeiroNome = By.id("txtName");
	private By ultimoNome = By.id("txtLastName");
	private By nascimento = By.id("txtDateOfBirth");
	private By sexo = By.cssSelector("#gender > span");
	private By cpf = By.id("txtCPF");
	private By email = By.id("txtEmail");
	private By checkbox = By.id("ckbPolicies");
	private By senha = By.id("txtPassword");
	private By Confirmarsenha = By.id("txtPasswordConfirm");
	private By ddd = By.id("txtPrimaryDDDPhone");
	private By telefone = By.id("txtPrimaryPhone");
	private By telefoneSelect = By.cssSelector("#divPrimaryPhoneType");
	private By codigoPostal = By.id("txtZipCodeFirst");
	private By codigoPostalNumero = By.id("txtZipCodeSecond");
	private By endereco = By.id("txtAddress");
	private By numero = By.id("txtNumber");
	private By complemento = By.id("txtComplement");
	private By bairro = By.id("txtNeighborhood");
	private By cidade = By.id("txtCity");
	private By estado = By.id("txtState");
	private By botaoSalvar = By.id("btnSave");

	// actions

	public void camposObrigatorios() throws InterruptedException {

		driver.findElement(primeiroNome).sendKeys("Joana");
		driver.findElement(ultimoNome).sendKeys("Silva");
		driver.findElement(nascimento).sendKeys("09061995");
		driver.findElement(sexo).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#gender_img > li:nth-child(2) > a")));
		element.click();
		driver.findElement(cpf).sendKeys("025.023.440-85");
		driver.findElement(email).sendKeys("tqt@gmail.com");
		driver.findElement(checkbox).click();
		driver.findElement(senha).sendKeys("L@zaro78");
		driver.findElement(Confirmarsenha).sendKeys("L@zaro78");
		driver.findElement(ddd).sendKeys("81");
		driver.findElement(telefone).sendKeys("99999-9999");
		driver.findElement(telefoneSelect).click();
		WebDriverWait waits = new WebDriverWait(driver, 10);
		WebElement elements = waits
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#phone_type > li:nth-child(2) > a")));
		elements.click();
		driver.findElement(codigoPostal).sendKeys("54140");
		driver.findElement(codigoPostalNumero).sendKeys("370");
		driver.findElement(endereco).sendKeys("Rua Santa Isabel");
		Thread.sleep(1000);
		driver.findElement(numero).sendKeys("54");
		driver.findElement(complemento).sendKeys("casa");
		driver.findElement(bairro).sendKeys("Santo Aleixo");
		driver.findElement(cidade).sendKeys("Jaboatão dos Guararapes");

	}

	public void acionarBotaoSalvar() {

		driver.findElement(botaoSalvar).click();

	}
}
