package teste;

import auxiliar.Constante;
import negocio.MacaAmor;

public class TestaMacaAmor {

	public static void main(String[] args) {
		
		MacaAmor maca = new MacaAmor();
		maca.setDescricao("Maça do  Amor");
		maca.setValor(Constante.VALOR_MACA);
		maca.setQuantMaca(30);
		maca.setChocolate(false);
		maca.imprimirTipo();
	}
}
