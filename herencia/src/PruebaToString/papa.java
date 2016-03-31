package PruebaToString;

public class papa {
	private String nombre;
	private int edad;

	public papa(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String toString() {
		return "El nombre de mi padre es " + nombre + " y la edad es de "
				+ edad;
	}

}