package TareaPeriodica;

public class AppGestorTareas {
	public static void main(String[] args) {
		TPAviso tpa = new TPAviso("Estudiar Principios de la Herencia!", 60);
		TPEjecucion tpe = new TPEjecucion("rm ~/tmp/*", 3600);

		while (!tpa.necesitaEjecucion())
			System.out.println("Esperando ejecución de aviso...");
		tpa.ejecutarTarea();
		while (!tpe.necesitaEjecucion())
			System.out.println("Esperando ejecución de comando...");
		tpe.ejecutarTarea();

		System.out.println("Aviso: " + tpa.leerMsg());
	}

}
