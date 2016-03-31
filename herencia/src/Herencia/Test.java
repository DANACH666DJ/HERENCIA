package Herencia;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ClaseC miObjetoC = new ClaseC("uno","dos","tres");
		ClaseB miObjetoB = new ClaseB("seis","siete");
		ClaseA miObjetoA = new ClaseA("cero");
		
		
		
//		ClaseA miObjetoC = new ClaseC("uno","dos","tres");
//		ClaseA miObjetoB = new ClaseB("seis","siete");
//		ClaseA miObjetoA = new ClaseA("cero");
   Object miObjeto =null;
		
   Scanner sc= new Scanner (System.in);
   System.out.println("¿Que clase quieres (A-B-C)?");
   switch(sc.nextLine()){
   case "A":
	   miObjeto=new ClaseA ("cero");
	    break;
   case "B":
	   miObjeto=new ClaseB ("seis","siete");
	    break;
   case "C":
	   miObjeto=new ClaseC ("uno","dos","tres");
	    break;
	   default:
		   System.out.println("Mala elección");
		   break;
   }
   System.out.println(miObjeto);
		
		
		

		System.out.println(miObjetoC.getAtributoC());
		System.out.println(miObjetoB.getAtributoB());
		System.out.println(miObjetoA.getAtributoA());

	}

}
