package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcionalidades.CadastroListaCasamentoPageObject;
import Funcionalidades.HeaderPageObject;
import Funcionalidades.LoginPageObject;
import Funcionalidades.MainPageObject;
import Funcionalidades.MinhaContaPageObject;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepsCriarListaCasamento {
	
	private WebDriver driver;
	
	MainPageObject main;
	LoginPageObject login;
	HeaderPageObject header;
	MinhaContaPageObject conta;
	CadastroListaCasamentoPageObject cadastroLista;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();

		header = new HeaderPageObject(driver);
		login = new LoginPageObject(driver);
		main = new MainPageObject(driver);
		cadastroLista = new CadastroListaCasamentoPageObject(driver);
		conta = new MinhaContaPageObject(driver);

	}
	
	@Dado("que o usuario esteja na pagina inicial do cvc")
	public void que_o_usuario_esteja_na_pagina_inicial_do_cvc() {
	   main.acessPage();
	}
	
	@Dado("aciona em login e minhas viagens")
	public void aciona_em_login_e_minhas_viagens() {
	   header.acessarLogin();
	}
	
	@Dado("preenche login\\/senha")
	public void preenche_login_senha() {
	    login.dadosAcesso();
	}

	@Dado("clica em minha lista de casamento")
	public void clica_em_minha_lista_de_casamento() {
	    conta.acionarMinhaListaCasamento();
	}

	@Dado("preenche todos os campos obrigatorios")
	public void preenche_todos_os_campos_obrigatorios() throws InterruptedException {
		
		Thread.sleep(4000);
	    cadastroLista.camposObrigatorios();
	}

	@Quando("acionar criar lista")
	public void acionar_criar_lista() {
	    cadastroLista.acionarCriarLista();
	}

	@Entao("aparecera que a lista esta ativa informando uma numeração")
	public void aparecera_que_a_lista_esta_ativa_informando_uma_numeração() throws InterruptedException {
		Thread.sleep(12000);
	    cadastroLista.exibirListaCriada();
	}
	
	@After
	public void afterScenario() {

		this.driver.quit();
	}

}
