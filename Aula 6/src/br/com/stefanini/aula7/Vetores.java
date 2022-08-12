package br.com.stefanini.aula7;

public class Vetores {
	public static void main(String[] args) {
		int[] notas = new int [10];
		notas[0] = 3;
		notas[3] = 9;
		
		int[][] matriz = new int [5][5];
		
		matriz[0][2]=5;
		matriz[2][4]=10;
		matriz[3][2]=15;
		
		for (int[] m:matriz) {
				for (int v:m) {
					System.out.println(v);
				}
		}
	}
}
