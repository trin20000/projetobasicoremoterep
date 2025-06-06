package br.sp.lbassi.pages;

import org.openqa.selenium.By;

import br.sp.lbassi.core.BasePage;
import br.sp.lbassi.core.DriverFactory;

public final class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me");
		
	}
	
	public void setEmail(String email) {
		escreve("email", email);
	}

	public void setSenha(String senha) {
		escreve("senha", senha);
	}
	
	public void entrar() {
		clicarBotao(By.xpath("//button[.='Entrar']"));
		
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();
		
	}
}
