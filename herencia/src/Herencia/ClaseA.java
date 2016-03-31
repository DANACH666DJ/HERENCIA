package Herencia;

public class ClaseA {
	protected String atributoA;

	public ClaseA(String atributoA) {
		this.atributoA = atributoA;
	}

	public void metodoA() {
		System.out.println("Holaarrrr");
	}

	public String getAtributoA() {

		return atributoA;
	}
	public String toString(){
		return "[atributoA=" + atributoA + "]";
	}

}
