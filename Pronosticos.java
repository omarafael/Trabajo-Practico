package PronosticosDeportivos;

public class Pronosticos {

	private Partido partido;
	private Equipo equipo1;
	private String result;
	
	
	public Pronosticos(Partido partido, Equipo equipo1, String result) {
		
		this.partido = partido;
		this.equipo1 = equipo1;
		this.result= result;
	}


	public Partido getPartido() {
		return partido;
	}


	public void setPartido(Partido partido) {
		this.partido = partido;
	}


	public Equipo getEquipo1() {
		return equipo1;
	}


	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}
	
	public int Puntos() {
		int Puntos=0;
		if (this.result.equals(partido.Resultadoequipo1())) {
			Puntos=1;
		}
			return Puntos;
		}
	}
	
	

