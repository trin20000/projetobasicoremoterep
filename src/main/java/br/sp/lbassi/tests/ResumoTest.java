package br.sp.lbassi.tests;


import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.sp.lbassi.core.BaseTest;
import br.sp.lbassi.core.DriverFactory;
import br.sp.lbassi.pages.MenuPage;
import br.sp.lbassi.pages.ResumoPage;

import static br.sp.lbassi.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ResumoTest extends BaseTest {
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();
	
	@Test
	public void test1ExcluirMovimentacao() {
		menuPage.acessarTelaResumo();
		
		resumoPage.excluirMovimentacao();
		
		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());		
		
	}

	@Test
	public void test2ResumoMensal() {
		menuPage.acessarTelaResumo();		
		
		Assert.assertEquals("Seu Barriga - Extrato", getDriver().getTitle());	
		
	}
}
