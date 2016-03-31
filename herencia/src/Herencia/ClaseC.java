package Herencia;

public class ClaseC extends ClaseB {
	private String atributoC;

	public ClaseC(String atributoA, String atributoB, String atributoC) {
		super(atributoA, atributoB);
		this.atributoC = atributoC;
	}

	public void metodoC() {

		System.out.println("Fin");
	}

	public String getAtributoC() {

		return atributoA+" "+atributoB+" "+atributoC;
	}

}
