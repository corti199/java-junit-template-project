package uk.co.placona.helloWorld;

public class Cronometro {

	private int tiempo = 0,hora=0,minuto=0;
	
public String obtener(){
		
	return "Hola";	
	}
	
	
	public void reiniciar (){
		
		tiempo=0;
		hora=0;
		minuto=0;
	}
	
	
	public void incrementarTiempo (int tiempo){
		
		if(minuto <=60){
			minuto+=1;
		}else {
			hora+=1;
			minuto=0;
		}
	}
	
	
	public String mosTiempotrarTiempo (){
		String horaCompleta="";
		horaCompleta+=Integer.toString(hora)+" horas,"+Integer.toString(minuto)+" minutos";
		
		
		return horaCompleta;
	}
	
	


}
