package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcionalidades.HeaderPageObject;
import Funcionalidades.MainPageObject;
import Funcionalidades.PassagensAereasPageObject;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepsViagem {

	private WebDriver driver;

	MainPageObject main;
	HeaderPageObject hearder;
	PassagensAereasPageObject passagem;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chorme.driver", "C:\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();

		main = new MainPageObject(driver);
		hearder = new HeaderPageObject(driver);
		passagem = new PassagensAereasPageObject(driver);

	}

	@Dado("que o usuario esteja no site da CVC")
	public void que_o_usuario_esteja_no_site_da_CVC() {
		main.acessPage();
	}

	@Dado("clica em Passagens")
	public void clica_em_Passagens() {
		hearder.acessarPasssagemAereas();
	}

	@Dado("no campo origem escrever {string}")
	public void no_campo_origem_escrever(String valor) {
		passagem.inserirOrigem(valor);
	}

	@Dado("no campo destino ecrever {string}")
	public void no_campo_destino_ecrever(String string) {
		passagem.inserirDestino(string);
	}

	@Dado("preencheu todos os campos obrigatorios")
	public void preencheu_todos_os_campos_obrigatorios() {
		passagem.ida();
	}

	@Quando("clicar em buscar")
	public void clicar_em_buscar() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Entao("o melhor preco por cia sera exibido")
	public void o_melhor_preco_por_cia_sera_exibido() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

}
