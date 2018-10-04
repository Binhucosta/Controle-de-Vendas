package teste;

import negocio.Comprador;

public class TestaComprador {

	public static void main(String[] args) {
		Comprador comprador = new Comprador();
		comprador.setNome("Rodrigo");
		comprador.setWhatsapp(985416730);
		comprador.setCidade("Duque de Caxias");
		comprador.setBairro("Jardim Leal");
		comprador.exibir();
	}
}
