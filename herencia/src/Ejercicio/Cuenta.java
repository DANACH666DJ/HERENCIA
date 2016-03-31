package Ejercicio;

import java.util.Date;
import java.util.LinkedList;

public class Cuenta {
	private long numero;
	private float saldo;
	private float interesAnual;
	private Cliente Titular;
	private LinkedList<Movimiento> movimiento; // Lista de movimientos

	static private class Movimiento {
		Date fecha;
		char tipo;
		float importe;
		float saldo;

		public Movimiento(Date aFecha, char aTipo, float aImporte, float aSaldo) {
			this.fecha = aFecha;
			this.tipo = aTipo;
			this.importe = aImporte;
			this.saldo = aSaldo;
		}

	}

	// Constructor general
	public Cuenta(long aNumero, Cliente aTitular, float aInteresAnual) {
		this.numero = aNumero;
		this.Titular = aTitular;
		this.saldo = 0;
		this.interesAnual = aInteresAnual;
		movimiento = new LinkedList<Movimiento>();

	}

	public Cuenta(long nc) {

		this.numero = nc;

	}

	// public Cuenta (long aNumero,Cliente aTitular,float interesAnual){
	// this.numero=aNumero;
	// this.saldo=0;
	// this.interesAnual=interesAnual;
	// this.Titular=aTitular;
	// }

	public Cliente getleerTitular() {
		return Titular;
	}

	public float leerSaldo() {

		return saldo;

	}

	public void reintegro(float cantidad) {
		// saldo -= cantidad;
		movimiento.add(new Movimiento(new Date(), 'R', cantidad,
				saldo -= cantidad));
	}

	public void ingreso(float cantidad) {
		// saldo += cantidad;
		movimiento.add(new Movimiento(new Date(), 'I', cantidad,
				saldo += cantidad));

	}

	public float eurosPesetas(float cantidad) {

		return cantidad;
	}

	public void ingresoInteresMes() {
		this.ingreso(interesAnual * saldo / 1200);
	}
	
	
	

}
