package negocio;
import auxiliar.Constante;
import interfaces.IExibido;

public class ValorDoce implements IExibido{
 
	public void exibir() {
		
		System.out.println("####VALOR_DOCE####");
		System.out.println("Trufa unidade:R$"+Constante.VALOR_TRUFA);
		System.out.println("Maçã do Amor Unidade:R$ "+Constante.VALOR_MACA);
		System.out.println("___________________________");

	}
}	