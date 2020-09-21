package implementacoes;



public abstract class FogueteBridge {

	public abstract void autoDestruir();

	public abstract void desacoplar();

	public abstract boolean checar();

	public abstract void decolar();
	
	/**
	 * TODO BRIDGE.01  //Feito
	 * 
	 * 1. Sempre, qualquer das implementacoes do tipo foguete (atuais ou futuras) devem ser capazes de mudarTrajetoria()
	 * 2. É mais conveniente tornar este metodo abstrato, ou devemos deixar ele com uma implementacao vazia-default 
	 * (ou com lançamento de exececao por default)?
	 * 3. Dependendo da modificacao escolhida, conserte erros em outras classes.
	 */
	public abstract void mudarTrajetoria(double angulo);   //INATHAN: acredito que seja melhor mudar para abstrato
	
	/**
	 * TODO BRIDGE.02  //Feito
	 * 
	 * 1. Somente FogueteNASA eh capaz de aterrisar.
	 * 2. É mais conveniente tornar este metodo abstrato, ou devemos deixar ele com uma implementacao vazia-default 
	 * (ou com lançamento de exececao por default)?
	 * 3. Dependendo da modificacao escolhida, conserte erros em outras classes.
	 */
	public void aterissar() {        //INATHAN: acredito que seja melhor deixar a implementa��o vazia
		
	}

}
