package abstracoes;

import implementacoes.FogueteBridge;

/**
 * TODO BRIDGE.03 //Feito
 * 
 * 1. Implemente cada metodo desta classe de abstracao de uso de um tipo Foguete 
 * (ver notas UML associadas aos metodos desta classe no diagrama).
 * 	
 */
public class PlataformaFoguete {
	
	protected FogueteBridge foguete;
	
	public PlataformaFoguete(FogueteBridge fogueteBridge) {
		this.foguete = fogueteBridge;
	}

	public void setFoguete(FogueteBridge foguete) {
		this.foguete = foguete;
	}
	
	public void simularDecolagem() {
		foguete.checar();
		foguete.decolar();
		foguete.desacoplar();
	}

	public void simularAterrisagem() {
		foguete.checar();
		foguete.aterissar();
	}

	public void simularDiagnostico() {
		foguete.checar();
	}

	public void simularDiagnosticarFormatado() {
		foguete.checar();
		System.out.println("Formatado");
	}

	
}
