package TareaPeriodica;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TPReloj implements TareaPeriodica {
	Date ultEjecucion;
	boolean activa;
	public TPReloj() {
		 activa = true; ultEjecucion = new Date(); 
	}

	
	public void ejecutarTarea() {
		Calendar cal = new GregorianCalendar();
		int min = cal.get(Calendar.MINUTE);
		System.out.println("Hora: " + cal.get(Calendar.HOUR_OF_DAY)
				+ " " + min);
				ultEjecucion = cal.getTime();
	 }
	public boolean necesitaEjecucion() {
		if (!activa)
		return false;
		Calendar calProximaEj = new GregorianCalendar();
		Calendar calUltEjecucion = new GregorianCalendar();
		calUltEjecucion.setTime(ultEjecucion);
		Calendar calAhora = new GregorianCalendar();
		if (calAhora.equals(calUltEjecucion))
		return false;
		int min = calAhora.get(Calendar.MINUTE);
		if (min == 00 || min == 30)
		return true;
		return false;
		}
	public void activar() { activa = true; }
	public void desactivar() { activa = false; }
	public String leerHora() {
	Calendar cal = new GregorianCalendar();
	return cal.get(Calendar.HOUR_OF_DAY) + ":" +
	cal.get(Calendar.MINUTE);
	}


}
