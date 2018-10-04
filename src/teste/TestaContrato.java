package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import negocio.Contrato;
import negocio.MacaAmor;
import negocio.PalhaItaliana;
import negocio.Trufa;

public class TestaContrato {
	
	public static void main(String[] args) {
		
		Calendar entrega = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");        
        try {
            Date data = (Date)df.parse("30/11/2018");            
            entrega.setTime(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}         		
		
		Trufa trufa = new Trufa();
		trufa.setQuantTrufa(100);
		
		MacaAmor maca = new MacaAmor();
		maca.setQuantMaca(35);		
		
		PalhaItaliana palha = new PalhaItaliana();
		palha.setQuantPalha(15); 
		
		Contrato contrato = new Contrato();
		contrato.setHora(entrega);
		contrato.setMacaAmor(maca);
		contrato.setTrufa(trufa);
		contrato.setPalhaItaliana(palha);
		contrato.exibir();
	}
}
