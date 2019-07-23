package StepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcionalidades.HeaderPageObject;
import Funcionalidades.ListaCasamentoPageObject;
import Funcionalidades.LoginPageObject;
import Funcionalidades.MainPageObject;
import Funcionalidades.MinhaContaPageObject;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepsValidarListaCasamento {
	
private WebDriver driver;
	
	MainPageObject main;
	HeaderPageObject header;
	LoginPageObject login;
	ListaCasamentoPageObject lista;
		
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();

		header = new HeaderPageObject(driver);
		login = new LoginPageObject(driver);
		main = new MainPageObject(driver);
		lista = new ListaCasamentoPageObject(driver);

	}
	
	@Dado("que o usuario esteja na home do site do cvc")
	public void que_o_usuario_esteja_na_home_do_site_do_cvc() {
	    main.acessPage();
	}

	@Dado("acionar login e minhas viagens")
	public void acionar_login_e_minhas_viagens() {
	    header.acessarLogin();
	}

	@Dado("clica em Lista de Casamento")
	public void clica_em_Lista_de_Casamento() {
	    login.acionarListaCasamento();
	}

	@Dado("preenche no campo noiva {string}")
	public void preenche_no_campo_noiva(String string) {
	   lista.inserirNoiva(string);
	}

	@Quando("acionar Pesquisar")
	public void acionar_Pesquisar() {
	    lista.acionarPesquisar();
	}

	@Entao("as informacoes do casamento sera exibido com sucesso")
	public void as_informacoes_do_casamento_sera_exibido_com_sucesso() throws InterruptedException {
		
		Thread.sleep(8000);
	    
		String textoElement = driver.findElement(By.cssSelector("#contentGiftListResultSearch > ul > li > ul > li:nth-child(2) > h1")).getText();
		assertEquals("Titulo incorreto", "INFORMAÇÕES DO CASAMENTO", textoElement);
	}
	
	@After
	public void afterScenario() {

		this.driver.quit();
	}

}
