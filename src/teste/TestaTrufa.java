package teste;

import negocio.Trufa;
import auxiliar.Constante;
public class TestaTrufa {

	public static void main(String[] args) {
		
		Trufa trufa = new Trufa();
		trufa.setDescricao("TRUFA");
		trufa.setValor(Constante.VALOR_TRUFA);
		trufa.setChocolate(false);
		trufa.setQuantTrufa(100);
		trufa.imprimirTipo();
	}
}
