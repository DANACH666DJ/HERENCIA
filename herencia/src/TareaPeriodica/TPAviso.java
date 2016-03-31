package TareaPeriodica;

public class TPAviso extends TareaPeriodica {
	String msg;

	public TPAviso(String aMsg, int aPeriodoSegs) {
		super(aPeriodoSegs);
		msg = aMsg;
		
	}

	public String leerMsg() {
		return msg;
	}
}
