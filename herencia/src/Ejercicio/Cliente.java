package Ejercicio;

import java.sql.Date;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String direccion;
	private String localidad;
	private Date fNacimiento;

	public Cliente(String nombre,String apellidos,String direccion,String localidad,Date fNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.localidad = localidad;
		this.fNacimiento = fNacimiento;
	}

	public String getNombreCompleto() {

		return nombre + apellidos;
	}

	public String getDireccionCompleta() {

		return direccion + localidad;
	}
}
