public class Bicicleta extends Vehiculo{
	
	private int piñones;

	Bicicleta(){
		piñones=0;
	}

	Bicicleta(int piniones){
		this.piñones=piniones;
	}

	Bicicleta(String marca, double kilometros, int piñones){
		super();
		this.piñones=piñones;
	}

	public int getPiñones() {
		return this.piñones;
	}

	public void setPiñones(int piñones) {
		this.piñones=piñones;
	}


}
