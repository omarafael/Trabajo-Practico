package PronosticosDeportivos;

public class Partido {
	
	private String IdPartido;
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	
	
	public Partido(String IdPartido, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
	
		this.IdPartido=IdPartido;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}


	public String getIdPartido() {
		return IdPartido;
	}


	public void setIdPartido(String idPartido) {
		IdPartido = idPartido;
	}


	public Equipo getEquipo1() {
		return equipo1;
	}


	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}


	public Equipo getEquipo2() {
		return equipo2;
	}


	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}


	public int getGolesEquipo1() {
		return golesEquipo1;
	}


	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}


	public int getGolesEquipo2() {
		return golesEquipo2;
	}


	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

    public String Resultadoequipo1() {
    	if (this.golesEquipo1>this.golesEquipo2){
    		return "ganador";
    		
    	}else if(this.golesEquipo1<this.getGolesEquipo2()) {
    		return "perdedor";
    	     }else return "empate";
    }
	
	
	
	
	

}
