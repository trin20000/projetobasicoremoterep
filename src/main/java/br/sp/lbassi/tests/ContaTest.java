package br.sp.lbassi.tests;

import org.junit.Assert;
import org.junit.Test;

import br.sp.lbassi.core.BaseTest;
import br.sp.lbassi.pages.ContasPage;
import br.sp.lbassi.pages.MenuPage;

public class ContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void testInserirConta() {
		menuPage.acessarTelaInserirConta();
		
		contasPage.setNome("Conta do Teste_b");
		contasPage.salvar();
		
		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}
	
	@Test
	public void testAlterarConta() {
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarAlterarConta("Conta do Teste alterada");
		contasPage.setNome("Conta do Teste alterada2");
		contasPage.salvar();
		Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
	}
	
	@Test
	public void testInserirContasMesmoNome() {
		menuPage.acessarTelaInserirConta();
		
		contasPage.setNome("Conta do Teste alterada2");
		contasPage.salvar();
		
		Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.obterMensagemErro());
	}

}
