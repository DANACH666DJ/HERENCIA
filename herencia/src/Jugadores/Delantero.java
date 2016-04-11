package Jugadores;

public class Delantero implements Jugador {
	private int goles;
	private int edad;
	private String nombre;
	private String equipo;

	public Delantero(int edad, String equipo, String nombre, int goles) {
		this.edad = edad;
		this.equipo = equipo;
		this.nombre = nombre;
		this.goles = goles;
	}

	public void Marcar() {
		System.out.println("El delantero ha marcado");
	}

	public String toString() {
		return "El delantero " + nombre + " con edad " + edad + " y el equipo "
				+ equipo + " ha marcado " + goles + " goles";
	}

	public void jugar() {
		System.out.println("El delantero sale al campo");

	}

}
