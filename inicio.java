package PronosticosDeportivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

import PronosticosDeportivos.Equipo;
import PronosticosDeportivos.Partido;
import PronosticosDeportivos.Pronosticos;
import PronosticosDeportivos.ResultadoEnum;

public class inicio {
	
	public static void main(String[] args) {
		String archivoPartidos="C:\\CursoJava\\EjerciciosAP\\ejprueba\\src\\PronosticosDeportivos\\resultado.txt";
		String archivoPronosticos="pronosticos.txt";
		try {
		
			List<String> listaresultados=Files.readAllLines(Paths.get(archivoPartidos));
			String[] datospart1=listaresultados.get(1).split(" ");                          //1;Argentina;Seleccionado;1;2;2;ArabiaSaudita;Seleccionado
			String[] datospart2=listaresultados.get(2).split(" ");                          //3;Polonia;Seleccionado;0;0;4;México;Seleccionado
		
			
			Equipo Argentina = new Equipo(datospart1[1], datospart1[2]);         //ingresa arg
			Equipo Arabia = new Equipo(datospart1[6], datospart1[7]);          // ingresa arabia
			Equipo Polonia = new Equipo(datospart2[1], datospart2[2]);          // ingresa polonia
			Equipo Mexico = new Equipo(datospart2[6], datospart2[7]);          // ingresa mexico
			
	
			
			Partido Partido1 = new Partido("Part1", Argentina, Arabia, Integer.parseInt(datospart1[3]), Integer.parseInt(datospart1[4]));
			Partido Partido2 = new Partido("Part2", Polonia, Mexico, Integer.parseInt(datospart2[3]), Integer.parseInt(datospart2[4]));
			
			
			Pronosticos Pronostico1 = new Pronosticos(Partido1,Argentina,"perdedor");
			Pronosticos Pronostico2 = new Pronosticos(Partido2,Polonia,"empate");
			
			int puntos=0;
			puntos=puntos+Pronostico1.Puntos();
			
			System.out.println(puntos);
			puntos=puntos+Pronostico2.Puntos();
			
			System.out.println(puntos);
			
			
			
			
			
		
		}catch(IOException e) {
			System.out.println("error" + e);
		}
	}
	
	
}

