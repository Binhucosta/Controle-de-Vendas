package negocio;

public class PalhaItaliana extends Produto {
	
	private int quantPalha;
	@Override
	public void imprimirTipo() {
		super.adicionarCabecalho();
		
		super.exibir();
			
		System.out.println("Quantidade encomendada: "+quantPalha);
		System.out.println("___________________________");
	}
	public int getQuantPalha() {
		return quantPalha;
	}
	public void setQuantPalha(int quantPalha) {
		this.quantPalha = quantPalha;
	}

}
