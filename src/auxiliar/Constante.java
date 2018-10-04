package auxiliar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//
public class Constante {
	
	public static final float VALOR_TRUFA = (float) 0.80;
	public static final float VALOR_MACA = (float) 1.00;
	public static final float VALOR_PALHA = (float) 1.50;
	public static final String HORA = "TUDO PARA SUA FESTA";
	
	public static String obterDataFormatada(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
        return df.format(data);
	}
	
	public static String obterHoraFormatada(Date data) {
		DateFormat df = new SimpleDateFormat("HH:mm");
		
        return df.format(data);
	}

	public static String obterDataHoraFormatada(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
        return df.format(data);
	}	
}
