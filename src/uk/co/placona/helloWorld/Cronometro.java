package uk.co.placona.helloWorld;

public class Cronometro {

	private int segundo=0,minuto=0;

		

	
	
	public void reiniciar (){
		
		segundo=0;
		minuto=0;
	}
	
	
	public void incrementarTiempo (int segundo){
		
		if(segundo <=60){
			segundo+=1;
		}else {
			minuto+=1;
			minuto=0;
		}
	}
	
	
	public String mosTiempotrarTiempo (){
		String horaCompleta="";
		horaCompleta+=Integer.toString(minuto)+" minutos,"+Integer.toString(segundo)+" segundos";
		
		
		return horaCompleta;
	}
	
	


}
