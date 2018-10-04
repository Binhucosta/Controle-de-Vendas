package negocio;

public class Trufa extends Produto{
	private int quantTrufa;
	@Override
	public void imprimirTipo() {
		
	super.adicionarCabecalho();
		super.exibir();
			
		System.out.println("Quantidade encomendada: "+quantTrufa);
		System.out.println("___________________________");
	}
	public int getQuantTrufa() {
		return quantTrufa;
	}
	public void setQuantTrufa(int quantTrufa) {
		this.quantTrufa = quantTrufa;
	}
	
}


