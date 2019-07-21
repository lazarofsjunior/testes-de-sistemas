package Funcionalidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Viagem {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		MainPageObject mainPage = new MainPageObject(driver);
		HeaderPageObject headerPage = new HeaderPageObject(driver);
		PassagensAereasPageObject passagens = new PassagensAereasPageObject(driver);
		LoginPageObject dados = new LoginPageObject(driver);
		MinhaContaPageObject conta = new MinhaContaPageObject(driver);

		mainPage.acessPage();
		
		WebElement teste = driver.findElement(By.cssSelector("#root > div.jss218 > a:nth-child(2) > span"));
		teste.click();
		
		
		//headerPage.acessarLogin();
		//dados.dadosAcesso();
		//dados.acionarEnviar();
		//Thread.sleep(3000);
		//conta.acionarAlterarDados();
		//conta.alterarBairro();
		//Thread.sleep(5000);
		//conta.acionarAlterarCadastro();
		
		
		
		//passagens.acionarBuscar();
		//passagens.inserirOrigem(null);
		//passagens.inserirDestino(null);

		// driver.quit();

	}

}
