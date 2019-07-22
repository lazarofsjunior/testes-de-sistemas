package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepsIncluirConvidadosCasamento {
	
	private WebDriver driver;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	/*@Dado("que o usuario criou a lista de casamento")
	public void que_o_usuario_criou_a_lista_de_casamento() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Dado("preenche os dados dos convidados obrigatorios")
	public void preenche_os_dados_dos_convidados_obrigatorios() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Quando("acionar o botao Enviar")
	public void acionar_o_botao_Enviar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Entao("aparecera na lista que foi adicionado")
	public void aparecera_na_lista_que_foi_adicionado() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/
	
	@After
	public void afterScenario() {

		this.driver.quit();
	}
}
