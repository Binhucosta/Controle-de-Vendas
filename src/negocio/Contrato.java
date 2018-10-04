package negocio;

import java.util.Calendar;

import auxiliar.Constante;
import interfaces.IExibido;
import negocio.MacaAmor;
import negocio.Trufa;

public class Contrato implements IExibido {
	private Trufa trufa;
	private MacaAmor macaAmor;
	private PalhaItaliana palhaItaliana;
	private Calendar hora;
	
	public void exibir(){
		System.out.println("####PAGAMENTO####");
		System.out.println("Trufa:R$"+calcularPagamentoTrufa());
		System.out.println("Maçã do Amor:R$"+calcularPagamentoMaca());
		System.out.println("Palha Palha Italiana:"+calcularPagamentopalha());
		System.out.println("DIA DA ENTREGA:"+Constante.obterDataFormatada(this.hora.getTime()));
		System.out.println("___________________________");
	}
	public float  calcularPagamentoTrufa() {
		return(Constante.VALOR_TRUFA * trufa.getQuantTrufa());
	}
	
	public float calcularPagamentoMaca() {
		return(Constante.VALOR_MACA * macaAmor.getQuantMaca());
	}
	public float  calcularPagamentopalha() {
		return(Constante.VALOR_PALHA * palhaItaliana.getQuantPalha());
	}
	public Trufa getTrufa() {
		return trufa;
	}
	public void setTrufa(Trufa trufa) {
		this.trufa = trufa;
	}
	public MacaAmor getMacaAmor() {
		return macaAmor;
	}
	public void setMacaAmor(MacaAmor macaAmor) {
		this.macaAmor = macaAmor;
	}
	public Calendar getHora() {
		return hora;
	}
	public void setHora(Calendar hora) {
		this.hora = hora;
	}
	public PalhaItaliana getPalhaItaliana() {
		return palhaItaliana;
	}
	public void setPalhaItaliana(PalhaItaliana palhaItaliana) {
		this.palhaItaliana = palhaItaliana;
	}
}

