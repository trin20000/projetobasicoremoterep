package br.sp.lbassi.tests;

import static br.sp.lbassi.utils.DataUtils.obterDataFormatada;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.sp.lbassi.core.BaseTest;
import br.sp.lbassi.pages.MenuPage;
import br.sp.lbassi.pages.MovimentacaoPage;
import br.sp.lbassi.utils.DataUtils;

public class MovimentacaoTest extends BaseTest {
	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movPage = new MovimentacaoPage();
	
	@Test
	public void testInserirMovimentacao() {
		menuPage.acessarTelaInserirMovimentacao();
		
		movPage.setDataMovimentacao(obterDataFormatada(new Date()));
		movPage.setDataPagamento(obterDataFormatada(new Date()));
		movPage.setDescricao("Movimentaçao do Teste");
		movPage.setInteressado("Interessado Qualquer");
		movPage.setValor("500");
		movPage.setConta("Conta do Teste alterada2");
		movPage.setStatusPago();
		movPage.salvar();
		
		Assert.assertEquals("Movimentação adicionada com sucesso!", movPage.obterMensagemSucesso());
	}
	
	@Test
	public void testCamposObrigatorios() {
		menuPage.acessarTelaInserirMovimentacao();
		movPage.salvar();
		List<String> erros = movPage.obterErros();
		Assert.assertTrue(erros.containsAll(Arrays.asList(
				"Data da Movimentação é obrigatório", "Data da Movimentação é obrigatório", "Descrição é obrigatório",
				"Interessado é obrigatório", "Valor é obrigatório", "Valor deve ser um número")));
		Assert.assertEquals(6, erros.size());
	}

	@Test
	public void inserirMovimentacaoFutura() {
		menuPage.acessarTelaInserirMovimentacao();
		
		Date dataFutura = DataUtils.obterDataComDiferencaDias(5);
		
		movPage.setDataMovimentacao(obterDataFormatada(dataFutura));
		movPage.setDataPagamento(obterDataFormatada(dataFutura));
		movPage.setDescricao("Movimentaçao do Teste");
		movPage.setInteressado("Interessado Qualquer");
		movPage.setValor("500");
		movPage.setConta("Conta do Teste alterada2");
		movPage.setStatusPago();
		movPage.salvar();
		
		List<String> erros = movPage.obterErros();
		Assert.assertTrue(erros.contains("Data da Movimentação deve ser menor ou igual à data atual"));
		Assert.assertEquals(1, erros.size());
		
	}
}
