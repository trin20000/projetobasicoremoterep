package br.sp.lbassi.tests;


import org.junit.Test;

import br.sp.lbassi.core.BaseTest;
import br.sp.lbassi.pages.MenuPage;
import br.sp.lbassi.pages.ResumoPage;
import org.junit.Assert;

public class ResumoTest extends BaseTest {
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();
	
	@Test
	public void testExcluirMovimentacao() {
		menuPage.acessarTelaResumo();
		
		resumoPage.excluirMovimentacao();
		
		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());		
		
	}

}
