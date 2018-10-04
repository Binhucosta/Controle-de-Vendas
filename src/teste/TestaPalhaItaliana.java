package teste;

import auxiliar.Constante;
import negocio.PalhaItaliana;

public class TestaPalhaItaliana {

	public static void main(String[] args) {
		
		PalhaItaliana palha = new PalhaItaliana();
		palha.setDescricao("Palha Italiana");
		palha.setValor(Constante.VALOR_PALHA);
		palha.setChocolate(true);
		palha.imprimirTipo();
	}
}
