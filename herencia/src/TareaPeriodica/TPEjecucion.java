package TareaPeriodica;

import java.lang.Runtime;
import java.io.IOException;

public class TPEjecucion extends TareaPeriodica {
	String cmd;

	public TPEjecucion(String aCmd, int aPeriodoSegs) {
		super(aPeriodoSegs);
		cmd = aCmd;
	}

	String leerCmd() {
		return cmd;
	}
}
