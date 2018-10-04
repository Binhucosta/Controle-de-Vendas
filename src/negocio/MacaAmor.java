package negocio;

public class MacaAmor extends Produto{
	
	private int quantMaca;
	
	@Override
	public void imprimirTipo() {
			super.adicionarCabecalho();
			
			System.out.println(" #MAÇA DO AMOR#");
			super.exibir();
			System.out.println("Quantidade encomendada: "+quantMaca);
			System.out.println("___________________________");
	}

	public int getQuantMaca() {
		return quantMaca;
	}

	public void setQuantMaca(int quantMaca) {
		this.quantMaca = quantMaca;
	}

}


