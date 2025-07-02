package br.sp.lbassi.pages;

import org.openqa.selenium.By;

import br.sp.lbassi.core.BasePage;

public class ContasPage extends BasePage {
	
	public void setNome(String nome) {
		
		escreve("nome", nome);
	}
	
	public void salvar() {
		clicarBotao(By.xpath("//button[@class='btn btn-primary']"));
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class=\"alert alert-success\"]"));
		
	}
}
