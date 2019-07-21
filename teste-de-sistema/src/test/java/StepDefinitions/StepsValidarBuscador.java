package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcionalidades.MainPageObject;
import Funcionalidades.ValidarBuscadorPageObject;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class StepsValidarBuscador {
	
	WebDriver driver;
	MainPageObject mainPageObject;
	ValidarBuscadorPageObject validarBuscadorPageObject;
	
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		mainPageObject = new MainPageObject(driver);
		validarBuscadorPageObject = new ValidarBuscadorPageObject(driver);
	}
	
	
	@Dado("que o usuario ja esteja no site do cvc")
	public void que_o_usuario_ja_esteja_no_site_do_cvc() {
		mainPageObject.acessPage();
	}

	@Dado("insere dados invalidos {string} em origem")
	public void insere_dados_invalidos_em_origem(String dadosOrigem) {
		validarBuscadorPageObject.origemInvalida(dadosOrigem);		
	}

	@Quando("ele preencher os campos obrigatorios")
	public void ele_preencher_os_campos_obrigatorios() {
		validarBuscadorPageObject.inserirDestino();
		validarBuscadorPageObject.inserirDataIda();
		validarBuscadorPageObject.inserirDataVolta();
		validarBuscadorPageObject.inserirPassageiro();
		
	}


	@Entao("clicar no botao de buscar e aparecera uma mensagem pedindo para selecionar a origem")
	public void aparecera_uma_mensagem_pedindo_para_selecionar_a_origem_e_aparecera_uma_mensagem_pedindo_para_selecionar_a_origem() {
		validarBuscadorPageObject.clicarBuscarParaMensagemAparecer();	    
	}
	
}
