package implementacoes;

public class FogueteChina extends FogueteBridge {
	
	private boolean destruido = false;
		
	@Override
	public void autoDestruir() {
		System.out.println("Zhōngguó hù tào bèi huǐ");
		this.destruido = true;
	}

	@Override
	public void desacoplar() {
		System.out.println("Zhōngguó lǚbó jiě ǒu");
		
	}

	@Override
	public boolean checar() {
		System.out.println("Pénghuà zhōngguó zhěnduàn");
		return !this.destruido;
	}

	@Override
	public void decolar() {
		System.out.println("Foquet China qǐfēi");
	}

	@Override
	public void mudarTrajetoria(double angulo) {
		System.out.println("Foquet zhōngguó gǎibiànle guǐjī：" + angulo);
		
	}

}
