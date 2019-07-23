package StepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcionalidades.HeaderPageObject;
import Funcionalidades.LoginPageObject;
import Funcionalidades.MainPageObject;
import Funcionalidades.MinhaContaPageObject;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepsDadosInvalidos {

	private WebDriver driver;

	MainPageObject main;
	HeaderPageObject header;
	LoginPageObject login;
	MinhaContaPageObject conta;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();

		header = new HeaderPageObject(driver);
		login = new LoginPageObject(driver);
		conta = new MinhaContaPageObject(driver);
		main = new MainPageObject(driver);

	}

	@Dado("que o usuario esteja na pagina principal do cvc")
	public void que_o_usuario_esteja_na_pagina_principal_do_cvc() {
		main.acessPage();
	}

	@Dado("acessou login e minhas viagens")
	public void acessou_login_e_minhas_viagens() {
		header.acessarLogin();
	}

	@Dado("preencheu login e senha invalidos")
	public void preencheu_login_e_senha_invalidos() {
		login.dadosInvalidos();
	}

	@Quando("acionar enviar")
	public void acionar_enviar() {
		login.acionarEnviar();
	}

	@Entao("aparecera a mensagem informando que o e invalido")
	public void aparecera_a_mensagem_informando_que_o_e_invalido() throws InterruptedException {
		
		Thread.sleep(7000);

		String textoElement = driver.findElement(By.xpath("//*[@id=\"dialogModal\"]/div")).getText();
		assertEquals("Titulo incorreto", "Usuário não encontrado!", textoElement);
	}

	@After
	public void afterScenario() {

		this.driver.quit();
	}

}
