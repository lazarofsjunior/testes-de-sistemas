package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Funcionalidades.HeaderPageObject;
import Funcionalidades.MainPageObject;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepsViagem {

	private static final WebDriver driver = null;

	@Dado("que o usuario esteja no site da CVC")
	public void que_o_usuario_esteja_no_site_da_CVC() {
		MainPageObject mainPage = new MainPageObject(driver);
		mainPage.acessPage();
	}

	@Dado("clica em Passagens")
	public void clica_em_Passagens() {
		HeaderPageObject headerPage = new HeaderPageObject(driver);
		headerPage.acessarPasssagemAereas();
	}

	@Dado("no campo origem escrever {string}")
	public void no_campo_origem_escrever(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Dado("no campo destino ecrever {string}")
	public void no_campo_destino_ecrever(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Dado("preencheu todos os campos obrigatorios")
	public void preencheu_todos_os_campos_obrigatorios() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
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
