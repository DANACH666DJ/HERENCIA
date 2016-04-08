package TareaPeriodica;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TPReloj extends TareaPeriodica {
	public TPReloj() {
		super(60);
	}

	public String leerHora() {
		Calendar cal = new GregorianCalendar();
		return cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE);
	}
	public void ejecutarTarea() {
		Calendar cal = new GregorianCalendar();
		int min = cal.get(Calendar.MINUTE);
		if (min == 0 || min == 30)
		System.out.println("Hora: " + cal.get(Calendar.HOUR_OF_DAY) + " " +
		min);
	 }
}
