package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcionalidades.FaleConoscoPageObject;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class StepsFaleConosco {
	
	WebDriver driver;
	FaleConoscoPageObject paginaFaleConosco;
	//PaginaPrincipal paginaPrincipal;
	
	
	@Before	
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		//paginaPrincipal = new PaginaPrincipal(driver);
		paginaFaleConosco = new FaleConoscoPageObject(driver);
	}
	
	
	@Dado("que o usuario esteja no formulario fale conosco")
	public void que_o_usuario_esteja_no_formulario_fale_conosco() {
	    
		//paginaPrincipal.abrirCvcMain();		
	    //paginaFaleConosco.clicarAtendimento();
	    
		//for (String winHandle : driver.getWindowHandles()) {
			//driver.switchTo().window(winHandle);
		//}
		
		//paginaFaleConosco.clicarFaleConosco();
		
		//for (String winHandle : driver.getWindowHandles()) {
			//driver.switchTo().window(winHandle);
		//}
		
	}

	@Dado("preencheu todos os campos obrigatorios com dados invalidos")
	public void preencheu_todos_os_campos_obrigatorios_com_dados_invalidos() {
	   
	    paginaFaleConosco.preencherFormulario();
	}

	@Quando("clicar em enviar mensagem")
	public void clicar_em_enviar_mensagem() {
		paginaFaleConosco.clicarEnviarMensagem();
	}

	@Entao("aparecera uma janela alertando o usuario que a mensagem nao foi enviada")
	public void aparecera_uma_janela_alertando_o_usuario_que_a_mensagem_nao_foi_enviada() {
	    
	    //ESTE CENÁRIO NÃO PODE SER IMPLEMENTADO
		//paginaFaleConosco.pegarMensagem();
	}


}
