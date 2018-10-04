package negocio;

public abstract class Produto {
	private String descricao;
	private float valor;
	private boolean chocolate;
	
	public abstract void imprimirTipo();
	
	public void exibir() {
		System.out.printf(
				"Descrição: %s\n" + 
				"Valor unidade: R$%.2f\n" + 
				"Chocolate Branco? %s\n",
				this.descricao,
				this.valor,
				this.chocolate ? "Sim" : "Não"
				);
	}
	
	protected final void adicionarCabecalho() {
		System.out.printf("    #Produto#\n");
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(double d) {
		this.valor = (float) d;
	}
	public boolean isChocolate() {
		return chocolate;
	}

	public void setChocolate(boolean chocolate) {
		this.chocolate = chocolate;
	}
}	



