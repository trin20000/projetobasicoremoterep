package br.sp.lbassi.pages;
import org.openqa.selenium.By;



import br.sp.lbassi.core.BasePage;

public class ContasPage extends BasePage {
	
	public void setNome(String nome) {
		
		escreve("nome", nome);
	}
	
	public void salvar() {
		clicarBotaoPorTexto("Salvar");
		
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class=\"alert alert-success\"]"));
		
	}
	
	public String obterMensagemErro() {
		return obterTexto(By.xpath("//div[@class=\"alert alert-danger\"]"));
		
	}

	public void clicarAlterarConta(String string) {
		obterCelula("Conta", string, "Ações", "tabelaContas")
			.findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();		
		
		
	}
}
