
package liga;

public class Liga {
	private String nombre;
	private Equipo[] equipos;
	private Arbitro[] arbitros;
	private Calendario calendario;
	private Clasificacion clasificacion;
	
	public Liga(String nombre, Equipo[] equipos, Arbitro[] arbitros) {
		this.nombre=nombre;
		this.equipos=equipos;
		this.arbitros=arbitros;
		
		//Generamos calendario
		calendario = new Calendario(this.equipos,this.arbitros);
		
		
	}

	public void cambiarNombre() {

		ui.print("El nombre actual de la liga es: " + this.getNombre());
		String nombreLiga = ui.readKeyboard("Introduzca un nuevo nombre para liga: ");
		while( nombreLiga.equals("") ) {
			nombreLiga = ui.readKeyboard("No puede dejar en blanco el nombre.\n"
					+ "Introduzca un nuevo nombre para liga: ");
		}
		
		this.setNombre(nombreLiga);
		ui.print("Los nuevos datos de la liga son:" + this.info() );
		ui.readKeyboard("Pulse enter para volver.");
		
	}
	
	public String info() {
		String salida = "";
		
		salida += "\nNombre de la liga: " + this.getNombre();
		salida += "\nCantidad de equipos: " + this.getEquipos().length ;
		salida += "\nCategorķa de los jugadores: " + this.getEquipos()[0].getJugadores()[0].getCategoria();
		salida += "\n";
		
		return salida;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Equipo[] getEquipos() {
		return equipos;
	}
	public void setEquipos(Equipo[] equipos) {
		this.equipos = equipos;
	}
	public Arbitro[] getArbitros() {
		return arbitros;
	}
	public void setArbitros(Arbitro[] arbitros) {
		this.arbitros = arbitros;
	}
	public Calendario getCalendario() {
		return calendario;
	}
	public void setCalendario(Calendario calendario) {
		this.calendario = calendario;
	}
	public Clasificacion getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}
}
