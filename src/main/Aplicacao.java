package main;

import abstracoes.PlataformaFogueteDestrutivel;
import abstracoes.PlataformaFogueteTrajetoria;
import abstracoes.PlataformaFoguete;
import implementacoes.FogueteAEB;
import implementacoes.FogueteBridge;
import implementacoes.FogueteChina;
import implementacoes.FogueteNASA;

public class Aplicacao {

	public static void main(String[] args) {

		/** 
		 * TODO BRIDGE.05
		 * 1. Comente a chamada dos demais metodos anteriores/posteriores a este.
		 * 2. Descomente este para executar ele e analisar em separado.
		 */
		
		//usandoAbstracaoDefaultPlataformaFogueteComVariasImplementacoesFoguete();
		
		
		
		/** 
		 * TODO BRIDGE.06
		 * 1. Comente a chamada dos demais metodos anteriores/posteriores a este.
		 * 2. Descomente este para executar ele e analisar em separado.
		 */
		
		//usandoAbstracaoAutodestrutivelPlataformaFogueteComVariasImplementacoesFoguete();
		
		
		
		/** 
		 * TODO BRIDGE.06
		 * 1. Comente a chamada dos demais metodos anteriores/posteriores a este.
		 * 2. Descomente este para executar ele e analisar em separado.
		 */
		//usandoAbstracaoTrajetoriaPlataformaFogueteComVariasImplementacoesFoguete();
		
	}

	private static void usandoAbstracaoDefaultPlataformaFogueteComVariasImplementacoesFoguete() {
		FogueteBridge fogueteBridge = new FogueteAEB();
		PlataformaFoguete plataformaDefault = new PlataformaFoguete(fogueteBridge);
		plataformaDefault.simularDiagnostico();
		plataformaDefault.simularDiagnosticarFormatado();
		plataformaDefault.simularAterrisagem();
		plataformaDefault.simularDecolagem();
		/** 
		 * TODO BRIDGE.05
		 * 1. Verifique se as saidas na console estao como esperado para a implementacao de foguete selecionada
		 */


		fogueteBridge = new FogueteChina();
		plataformaDefault.setFoguete(fogueteBridge);
		plataformaDefault.simularDiagnostico();
		plataformaDefault.simularDiagnosticarFormatado();
		plataformaDefault.simularAterrisagem();
		plataformaDefault.simularDecolagem();
		/** 
		 * TODO BRIDGE.05
		 * 1. Verifique se as saidas na console estao como esperado para a implementacao de foguete selecionada
		 */

		fogueteBridge = new FogueteNASA();
		plataformaDefault.setFoguete(fogueteBridge);
		plataformaDefault.simularDiagnostico();
		plataformaDefault.simularDiagnosticarFormatado();
		plataformaDefault.simularAterrisagem();
		plataformaDefault.simularDecolagem();
		/** 
		 * TODO BRIDGE.05
		 * 1. Verifique se as saidas na console estao como esperado para a implementacao de foguete selecionada
		 */

	}
	
	private static void usandoAbstracaoAutodestrutivelPlataformaFogueteComVariasImplementacoesFoguete() {
		FogueteBridge fogueteBridge = new FogueteAEB();
		PlataformaFogueteDestrutivel plataformaDestrutivel= new PlataformaFogueteDestrutivel(fogueteBridge);
		plataformaDestrutivel.simularDiagnostico();
		plataformaDestrutivel.simularDiagnosticarFormatado();
		plataformaDestrutivel.simularAterrisagem();
		plataformaDestrutivel.simularDecolagem();
		plataformaDestrutivel.simularDestruicao();
		/** 
		 * TODO BRIDGE.06
		 * 1. Verifique se as saidas na console estao como esperado para a implementacao de foguete selecionada
		 */

		fogueteBridge = new FogueteChina();
		plataformaDestrutivel.setFoguete(fogueteBridge);
		plataformaDestrutivel.simularDiagnostico();
		plataformaDestrutivel.simularDiagnosticarFormatado();
		plataformaDestrutivel.simularAterrisagem();
		plataformaDestrutivel.simularDecolagem();
		plataformaDestrutivel.simularDestruicao();
		/** 
		 * TODO BRIDGE.06
		 * 1. Verifique se as saidas na console estao como esperado para a implementacao de foguete selecionada
		 */

		fogueteBridge = new FogueteNASA();
		plataformaDestrutivel.setFoguete(fogueteBridge);
		plataformaDestrutivel.simularDiagnostico();
		plataformaDestrutivel.simularDiagnosticarFormatado();
		plataformaDestrutivel.simularAterrisagem();
		plataformaDestrutivel.simularDecolagem();
		plataformaDestrutivel.simularDestruicao();
		/** 
		 * TODO BRIDGE.06
		 * 1. Verifique se as saidas na console estao como esperado para a implementacao de foguete selecionada
		 */
	}
	
	
	private static void usandoAbstracaoTrajetoriaPlataformaFogueteComVariasImplementacoesFoguete() {
		FogueteBridge fogueteBridge = new FogueteAEB();
		
		/** 
		 * TODO BRIDGE.07
		 * 1.Implemente uma nova classe de asbtracao de uso de foguetes de nome PlataformaFogueteTrajetoria 
		 * (veja seus metodos e como implementa-los no diagrama UML de classes fornecido neste projeto)
		 * 2. Instancie a abstracao especifica, com new PlataformaFogueteTrajetoria(). 
		 */
		PlataformaFoguete plataformaTrajetoria= new PlataformaFogueteTrajetoria(fogueteBridge);
		plataformaTrajetoria.simularDiagnostico();
		plataformaTrajetoria.simularDiagnosticarFormatado();
		plataformaTrajetoria.simularAterrisagem();
		plataformaTrajetoria.simularDecolagem();
		/** 
		 * TODO BRIDGE.07
		 * 1. Verifique se as saidas na console estao como esperado para a implementacao de foguete selecionada
		 */

		fogueteBridge = new FogueteChina();
		plataformaTrajetoria.setFoguete(fogueteBridge);
		plataformaTrajetoria.simularDiagnostico();
		plataformaTrajetoria.simularDiagnosticarFormatado();
		plataformaTrajetoria.simularAterrisagem();
		plataformaTrajetoria.simularDecolagem();
		/** 
		 * TODO BRIDGE.07
		 * 1. Verifique se as saidas na console estao como esperado para a implementacao de foguete selecionada
		 */

		fogueteBridge = new FogueteNASA();
		plataformaTrajetoria.setFoguete(fogueteBridge);
		plataformaTrajetoria.simularDiagnostico();
		plataformaTrajetoria.simularDiagnosticarFormatado();
		plataformaTrajetoria.simularAterrisagem();
		plataformaTrajetoria.simularDecolagem();
		/** 
		 * TODO BRIDGE.07
		 * 1. Verifique se as saidas na console estao como esperado para a implementacao de foguete selecionada
		 */
		
	}
}
