public class Bicicleta extends Vehiculo{
	
	private int pi�ones;

	Bicicleta(){
		pi�ones=0;
	}

	Bicicleta(int piniones){
		this.pi�ones=piniones;
	}

	Bicicleta(String marca, double kilometros, int pi�ones){
		super();
		this.pi�ones=pi�ones;
	}

	public int getPi�ones() {
		return this.pi�ones;
	}

	public void setPi�ones(int pi�ones) {
		this.pi�ones=pi�ones;
	}


}
