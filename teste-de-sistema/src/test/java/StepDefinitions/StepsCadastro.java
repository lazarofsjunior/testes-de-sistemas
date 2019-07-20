package StepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcionalidades.CadastroDeClientePageObject;
import Funcionalidades.HeaderPageObject;
import Funcionalidades.LoginPageObject;
import Funcionalidades.MainPageObject;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepsCadastro {

	private WebDriver driver;

	MainPageObject main;
	HeaderPageObject hearder;
	CadastroDeClientePageObject cadastro;
	LoginPageObject login;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();

		main = new MainPageObject(driver);
		hearder = new HeaderPageObject(driver);
		cadastro = new CadastroDeClientePageObject(driver);
		login = new LoginPageObject(driver);

	}

	@Dado("que o usuario no site do cvc")
	public void que_o_usuario_no_site_do_cvc() {
		main.acessPage();
	}

	@Dado("clica em login e minhas viagens")
	public void clica_em_login_e_minhas_viagens() {
		hearder.acessarLogin();
	}

	@Dado("clica cadastrar em cliente")
	public void clica_cadastrar_em_cliente() {

		login.cadastrarNovoCliente();
	}

	@Dado("preencheu todos os campos obrigatórios")
	public void preencheu_todos_os_campos_obrigatórios() {
		cadastro.camposObrigatorios();
	}

	@Quando("acionar cadastrar")
	public void acionar_cadastrar() throws InterruptedException {
		cadastro.acionarBotaoSalvar();
	}

	@Entao("aparecera a mensagem informando que os dados foram salvos com sucesso")
	public void aparecera_a_mensagem_informando_que_os_dados_foram_salvos_com_sucesso() {
		String textoElement = driver.findElement(By.cssSelector("#dialogModal > b")).getText();
		assertEquals("Titulo incorreto", "Os dados foram salvos", textoElement);
	}

	@After
	public void afterScenario() {

		this.driver.quit();
	}

}
