package br.sp.lbassi.suite;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.sp.lbassi.core.DriverFactory;
import br.sp.lbassi.pages.LoginPage;
import br.sp.lbassi.tests.ContaTest;
import br.sp.lbassi.tests.MovimentacaoTest;
import br.sp.lbassi.tests.RemoverMovimentacaoContaTest;
import br.sp.lbassi.tests.ResumoTest;
import br.sp.lbassi.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})

public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	
	@BeforeClass	
	public static void inicializa() {
		page.acessarTelaInicial();
		
		page.setEmail("bassi@bassi");
		page.setSenha("123456");
		page.entrar();
		
	}
	
	@AfterClass
	
	private static void checkTransactions() {
		Select select = new Select(DriverFactory.getDriver().findElement(By.id("tabelaExtrato")));
		List<WebElement> options = select.getOptions();
		
		
		
	
	
	}
	
	public static void finaliza() {
		DriverFactory.killDriver();
	}

}
