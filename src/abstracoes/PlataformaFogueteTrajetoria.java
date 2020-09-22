package abstracoes;

import implementacoes.FogueteBridge;

/** 
 * TODO BRIDGE.07//Feito
 * 1.Implemente os metodos desta classe. Veja como implementa-los no diagrama UML de classes fornecido neste projeto.
 */
public class PlataformaFogueteTrajetoria extends PlataformaFoguete {

	public PlataformaFogueteTrajetoria(FogueteBridge fogueteBridge) {
		super(fogueteBridge);
	}

	public void simularDecolagem(double angulo) {
		super.simularDecolagem();
		super.foguete.mudarTrajetoria(angulo);
	}
	
	public void simularAterrisagem(double angulo) {
		super.simularAterrisagem();
		super.foguete.mudarTrajetoria(angulo);
	}
}
