package br.sp.lbassi.tests;

import org.junit.Assert;
import org.junit.Test;

import br.sp.lbassi.core.BaseTest;
import br.sp.lbassi.core.Propriedades;
import br.sp.lbassi.pages.ContasPage;
import br.sp.lbassi.pages.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void testExcluirContaComMovimentacao() {
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}

}
