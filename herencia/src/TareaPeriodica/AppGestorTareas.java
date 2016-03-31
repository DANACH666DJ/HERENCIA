package TareaPeriodica;

public class AppGestorTareas {
	public static void main(String[] args) {
		TareaPeriodica tp = new TareaPeriodica(5);
		TPAviso tpa = new TPAviso("Estudiar Principios de la Herencia!", 60);
		while (!tp.necesitaEjecucion())
		System.out.println("Esperando ejecución de tarea periódica...");
		tp.ejecutarTarea();
		while (!tpa.necesitaEjecucion())
		System.out.println("Esperando ejecución de aviso...");
		System.out.println("Aviso: " + tpa.leerMsg()); 
		}

}
