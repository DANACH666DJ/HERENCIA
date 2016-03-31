package Herencia;

public class ClaseB extends ClaseA {

	protected String atributoB;

	public ClaseB(String atributoA, String atributoB) {
		super(atributoA);
		this.atributoB = atributoB;
	}

	public void metodoB() {
		System.out.println("Adios");
	}

	public String getAtributoB() {

		return atributoA+" "+atributoB;
	}

}
