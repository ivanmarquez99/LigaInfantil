
package liga;

import java.util.Arrays;

public class Jornada {
	private Partido[] partidos;
	private boolean terminada=false;

	public Partido[] getPartidos() {
		return partidos;
	}

	public void setPartidos(Partido[] partidos) {
		this.partidos = partidos;
	}
	
	

	public boolean isTerminada() {
		return terminada;
	}

	public void setTerminada(boolean terminada) {
		this.terminada = terminada;
	}
	
	public void terminar() {
		this.terminada=true;
	}

	public String[][] toStringArray() {
		
		String[][] retorno = {};
		for (int i=0;i<this.partidos.length;i++)
		{
			String[] arrayTemp = this.partidos[i].toStringArray();
			retorno = myutils.arrayAdd(retorno, arrayTemp);
		}

//System.out.println( Arrays.toString(retorno) );
		
		return retorno;
	}

	
	@Override
	public String toString() {
		String cadena = "Jornada: \n";
		for (int i=0;i<this.partidos.length;i++)
		{
			cadena+=this.partidos[i];
		}

		return cadena;
	}
}
