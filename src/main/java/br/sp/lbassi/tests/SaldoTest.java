package br.sp.lbassi.tests;
import br.sp.lbassi.core.BaseTest;
import br.sp.lbassi.core.Propriedades;
import br.sp.lbassi.pages.HomePage;
import br.sp.lbassi.pages.MenuPage;

import org.junit.Assert;
import org.junit.Test;

public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();
	
	@Test
	public void testSaldoConta() {	
		
		menu.acessarTelaPrincipal();
		Assert.assertEquals("500.00",page.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
	}

}
