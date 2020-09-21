package abstracoes;

import implementacoes.FogueteBridge;

public class PlataformaFogueteDestrutivel extends PlataformaFoguete {

	public PlataformaFogueteDestrutivel(FogueteBridge f) {
		super(f);
	}

	/**
	 * TODO BRIDGE.04  //Feito
	 * 
	 * 1. Implemente este metodo desta classe de abstracao de uso de um tipo Foguete 
	 * (ver nota UML associada a este metodo no diagrama).
	 * 	
	 */
	public void simularDestruicao() {
		foguete.autoDestruir();
	}
}
