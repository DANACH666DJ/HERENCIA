package Ejercicio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjercicioTest {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long nc;
		float mi;
		Cuenta c;
		try {
		System.out.println("Introduzca núm. de la cuenta: ");
		nc = Long.parseLong(br.readLine());
		System.out.println("Introduzca importe a retirar: ");
		mi = Float.parseFloat(br.readLine());
		} catch(Exception e) {
		System.out.println("Error al leer datos");
		return;
		}
		try {
		c = new Cuenta(nc);
		}
		catch(Exception e) {
		System.out.println("Imposible recuperar cuenta");
		return;
		}
		if (c.leerSaldo() < mi)
		System.out.println("Saldo insuficiente");
		else
		c.reintegro(mi);
		c.salvar();

	}

}
