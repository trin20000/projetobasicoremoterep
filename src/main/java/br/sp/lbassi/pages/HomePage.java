package br.sp.lbassi.pages;

import br.sp.lbassi.core.BasePage;

public class HomePage extends BasePage {
	public String obterSaldoConta(String nome) {
		
			return obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();		
		
	}

}
