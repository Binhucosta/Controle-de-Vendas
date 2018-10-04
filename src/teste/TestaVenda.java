package teste;

import negocio.Comprador;
import negocio.Contrato;
import negocio.MacaAmor;
import negocio.PalhaItaliana;
import negocio.Pedido;
import auxiliar.Constante;

public class TestaVenda {

	public static void main(String[] args) {
		Comprador comprador = new Comprador();
		comprador.setNome("Rodrigo");
		comprador.setWhatsapp(985416730);
		comprador.setCidade("Duque de Caxias");
		comprador.setBairro("Jardim Leal");
		comprador.exibir();
		
		Pedido ped = new Pedido();
		ped.setChocolate(true);
		
		Contrato pag = new Contrato();
		pag.exibir();
		
		PalhaItaliana palha = new PalhaItaliana();
		palha.setDescricao("Palha Italiana");
		palha.setValor(Constante.VALOR_PALHA);
		palha.setChocolate(true);
		palha.imprimirTipo();
		
		MacaAmor maca = new MacaAmor();
		maca.setDescricao("Maça do  Amor");
		maca.setValor(Constante.VALOR_MACA);
		maca.setChocolate(false);
		maca.imprimirTipo();
	}
}
