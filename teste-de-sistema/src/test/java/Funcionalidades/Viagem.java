package Funcionalidades;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Viagem {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		MainPageObject mainPage = new MainPageObject(driver);
		HeaderPageObject headerPage = new HeaderPageObject(driver);
		PassagensAereasPageObject passagens = new PassagensAereasPageObject(driver);

		mainPage.acessPage();
		headerPage.acessarPasssagemAereas();
		passagens.inserirOrigem();

		// driver.quit();

	}

}
