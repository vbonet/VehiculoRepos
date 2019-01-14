
public class Vehiculo {
	private String marca;
	private double km;

	Vehiculo() {
		this.marca = "";
		this.km = 0;
	}

	Vehiculo(String marca, int km) {

		this.marca = marca;
		this.km = km;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

}
