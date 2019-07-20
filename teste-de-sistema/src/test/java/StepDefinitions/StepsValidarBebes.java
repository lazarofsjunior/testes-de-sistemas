package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcionalidades.MainPageObject;
import Funcionalidades.ValidarBebesPageObject;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepsValidarBebes {

	private WebDriver driver;

	MainPageObject mainPageObject;
	ValidarBebesPageObject validarBebesPageObject;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		mainPageObject = new MainPageObject(driver);
		validarBebesPageObject = new ValidarBebesPageObject(driver);
	}

	@Dado("que o usuario esteja no site do CVC")
	public void que_o_usuario_esteja_no_site_do_CVC() {

		mainPageObject.acessPage();

	}

	@Dado("no campo origem escreve {string}")
	public void no_campo_origem_escreve(String string) {
		validarBebesPageObject.inserirOrigem(string);
	}

	@Dado("no campo destino ecreve {string}")
	public void no_campo_destino_ecreve(String string) {
		validarBebesPageObject.inserirDestino(string);
	}

	@Dado("insere datas validas")
	public void insere_datas_validas() {
		validarBebesPageObject.inserirDataIda();
		validarBebesPageObject.inserirDataVolta();
	}

	@Quando("ele inserir sete bebes para um unico adulto")
	public void ele_inserir_sete_bebes_para_um_unico_adulto() {
		validarBebesPageObject.seteBebes();
	}

	@Quando("clicar no botao buscar")
	public void clicar_no_botao_buscar() {
		// validarBebesPageObject.buscar();
	}

	@Entao("uma mensagem de alerta devera aparecer sobre limite de bebes por adulto")
	public void uma_mensagem_de_alerta_devera_aparecer_sobre_limite_de_bebes_por_adulto() {
		// validarBebesPageObject.ImprimirMensagem();
	}

	@After
	public void afterScenario() {
		// driver.quit();
	}

}
