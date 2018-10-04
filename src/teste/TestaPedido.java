package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import auxiliar.Constante;
import negocio.Comprador;
import negocio.Contrato;
import negocio.MacaAmor;
import negocio.PalhaItaliana;
import negocio.Produto;
import negocio.Trufa;

public class TestaPedido {

	public static void main(String[] args) {
		
		Calendar entrega = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");        
        try {
            Date data = (Date)df.parse("30/11/2018");            
            entrega.setTime(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}         		
		
		
		Comprador comprador = new Comprador();
		comprador.setNome("Rodrigo");
		comprador.setWhatsapp(985416730);
		comprador.setCidade("Duque de Caxias");
		comprador.setBairro("Jardim Leal");
		comprador.exibir();

		Trufa trufa = new Trufa();
		trufa.setDescricao("TRUFA");
		trufa.setValor(Constante.VALOR_TRUFA);
		trufa.setChocolate(false);
		trufa.setQuantTrufa(100);
		trufa.imprimirTipo();
		
		PalhaItaliana palha = new PalhaItaliana();
		palha.setDescricao("Palha Italiana");
		palha.setValor(Constante.VALOR_PALHA);
		palha.setChocolate(true);
		palha.setQuantPalha(35);
		palha.imprimirTipo();
		
		MacaAmor maca = new MacaAmor();
		maca.setDescricao("Maça do Amor");
		maca.setValor(Constante.VALOR_MACA);
		maca.setQuantMaca(30);
		maca.setChocolate(false);
		maca.imprimirTipo();
		
		List<Produto> lista = new ArrayList<Produto>();
		
		lista.add(maca);
		lista.add(trufa);
		lista.add(palha);
		      
		Contrato contrato = new Contrato();
		contrato.setHora(entrega);
		contrato.setMacaAmor(maca);
		contrato.setTrufa(trufa);
		contrato.setPalhaItaliana(palha);
		contrato.exibir();
		
	}
}
