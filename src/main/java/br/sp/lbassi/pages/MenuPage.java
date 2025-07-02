package br.sp.lbassi.pages;

import br.sp.lbassi.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaInserirConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
		
	}

	public void acessarTelaListarConta() {
		clicarLink("Contas");
		clicarLink("Listar");
		
	}
}
