package FIGURAS;

public class Cuadrado implements Figura {
	// Atributo
	protected int lado;

	// Constructor
	public Cuadrado(int lado) {
		this.lado = lado;
	}

	// Métodos
	public double area() {
		return lado * lado;
	}

	public void mostrarNombre() {
		System.out.println("La figura es un Cuadrado");
	}

}
