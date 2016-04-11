package TareaPeriodica;

import java.lang.Runtime;
import java.io.IOException;

public class TPEjecucion implements TareaPeriodica {
	String cmd;
	
	public TPEjecucion(String aCmd, int aPeriodoSegs) {
		super();
		cmd = aCmd;
		}

	@Override
	public boolean necesitaEjecucion() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ejecutarTarea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desactivar() {
		// TODO Auto-generated method stub
		
	}

}
