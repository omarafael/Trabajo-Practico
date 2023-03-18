package PronosticosDeportivos;

public class inicio2 {

	public static void main(String[] args) {
		int puntos=0;
		
		Equipo Argentina = new Equipo("Argentina", "Seleccion")  ;
		Equipo Arabia = new Equipo("Arabia", "Seleccion")  ;
		Equipo Polonia = new Equipo("Polonia", "Seleccion")  ;
		Equipo Mexico = new Equipo("Mexico", "Seleccion")  ;
		
		
		Partido Partido1 = new Partido("P1",Argentina,Arabia,2,1);
		Partido Partido2 = new Partido("P2",Polonia,Mexico,1,1);
		
		Pronosticos Pronostico1 = new Pronosticos(Partido1,Argentina,"ganador");
		
		Pronosticos Pronostico2= new Pronosticos(Partido2,Polonia,"empate");
		
		
		
		
		System.out.println(Partido1.getEquipo2().getNombre());
		System.out.println(Mexico.getDescripcion());
		System.out.println(Pronostico1.Puntos());
		puntos=puntos+Pronostico1.Puntos();
		System.out.println(Pronostico2.Puntos());
		puntos=puntos+Pronostico2.Puntos();
		System.out.println("Total puntos de Mariana: " + puntos);
	
		
		
	}
	
	
	
}
