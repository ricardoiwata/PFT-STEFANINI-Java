package com.stefanini.vetores;

public class Vetores {
	public static void main(String[] args) {
		int notas[] = new int[10];
		notas[0]=1;
		notas[3]=7;
		notas[9]=15;
		//notas[11]=0;
		
		String[] carros = new String[] {"Volvo", "Volkswagen", "Fiat"};
		
		System.out.println(carros.length);
		
		for (String carro : carros) {
			System.out.println(carro);
		}
		
		/* for (int i = 0; i<notas.length; i++){
		  System.out.println(notas[i]);
		 }*/
		 
	}

}
