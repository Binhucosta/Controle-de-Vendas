package negocio;

import java.util.List;

import interfaces.IExibido;

public class Pedido implements IExibido {
	private boolean chocolate;
	private List <Produto> produto;
	private Comprador comprador;
	
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	public boolean isChocolate() {
		return chocolate;
	}
	public void setChocolate(boolean chocolate) {
		this.chocolate = chocolate;
	}
	
	public void exibir() {
		
		System.out.println("####PEDIDO####");	
		System.out.println("Trufas:");
		System.out.printf("Chocolate Branco: %s",
				chocolate ? "sim" : "não"
				);
		System.out.println("___________________________");

	}
	public Comprador getComprador() {
		return comprador;
	}
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
}
