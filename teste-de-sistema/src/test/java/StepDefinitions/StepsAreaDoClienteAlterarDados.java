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

public class StepsAreaDoClienteAlterarDados {
	
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
	
	@Dado("que o usuario esteja no site do cvc")
	public void que_o_usuario_esteja_no_site_do_cvc() {
	    main.acessPage();
	}
	
	@Dado("clica em login e minha viagens")
	public void clica_em_login_e_minha_viagens() {
	    header.acessarLogin();
	}

	@Dado("preenche login e  senha")
	public void preenche_login_e_senha() {
	   login.dadosAcesso();
	   
	}
	
	@Dado("aciona enviar")
	public void aciona_enviar() {
	    login.acionarEnviar();
	}

	@Dado("clica para alterar seus dados cadastrais")
	public void clica_para_alterar_seus_dados_cadastrais() {
	    conta.acionarAlterarDados();
	}

	@Dado("altera o campo bairro")
	public void altera_o_campo_bairro() {
	    conta.alterarBairro();
	}

	@Quando("acionar alterar cadastro")
	public void acionar_alterar_cadastro() {
	    conta.acionarAlterarCadastro();
	}

	@Entao("o campo sera alterado com sucesso")
	public void o_campo_sera_alterado_com_sucesso() throws InterruptedException {
		
		Thread.sleep(4000);
		String textoElement = driver.findElement(By.xpath("//*[@id=\"menuHomeLogged\"]/div/form/h2")).getText();
		assertEquals("Titulo incorreto", "Meu cadastro", textoElement);
	}
	
	@After
	public void afterScenario() {

		this.driver.quit();
	}

}
