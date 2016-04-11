package Jugadores;

public class Portero implements Jugador {
	private int inbatibilidad;
	private int edad;
	private String nombre;
	private String equipo;

	public Portero(int edad, String equipo, String nombre, int inbatibilidad) {
		this.edad = edad;
		this.equipo = equipo;
		this.nombre = nombre;
		this.inbatibilidad = inbatibilidad;
	}

	public void parar() {
		System.out.println("El portero ha parado");
	}

	public String toString() {
		return "El portero " + nombre + " con edad " + edad + " y el equipo "
				+ equipo + " tiene una imbatibilidad de " + inbatibilidad +" partidos";
	}

	
	public void jugar() {
		System.out.println("El portero sale al campo");
		
	}
}
