public class Coche extends Vehiculo {

	private int cilindrada;

	Coche() {
		cilindrada = 0;
	}

	Coche(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	Coche(String marca, double kilometros, int cilindrada) {
		super();
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return this.cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public void pitar() {
		System.out.println("piiiiiiiiiiiiiii");
	}

}
