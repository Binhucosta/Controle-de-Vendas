package negocio;

import interfaces.IExibido;

public class Comprador implements IExibido  {

	private String nome;
	private int whatsapp;
	private String cidade;
	private String bairro;

	public void exibir() {
		System.out.println("####COMPRADOR####");
		System.out.println("NOME:"+nome);
		System.out.println("WHATSAPP:"+whatsapp);
		System.out.println("CIDADE:"+cidade);
		System.out.println("BAIRRO:"+bairro);
		System.out.println("___________________________");
		}
	
	
	protected final void adicionarCabecalho() {
		System.out.printf("#DADOS PESSOAIS#");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(int whatsapp) {
		this.whatsapp = whatsapp;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
}
