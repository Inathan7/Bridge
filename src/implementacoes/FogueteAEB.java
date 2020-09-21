package implementacoes;

public class FogueteAEB extends FogueteBridge {

	private boolean eliminado;

	@Override
	public void autoDestruir() {
		System.out.println("Foguete AEB destruido");

	}

	@Override
	public void desacoplar() {
		System.out.println("Foguete AEB desacoplou");

	}

	@Override
	public boolean checar() {
		System.out.println("Foguete AEB diagnosticado");
		return !this.eliminado;
	}

	@Override
	public void decolar() {
		System.out.println("Foguete AEB decolou");

	}

	@Override
	public void mudarTrajetoria(double angulo) {
		System.out.println("Foguete AEB mudou de trajetória: " + angulo);
		
	}

}
