package arays;

import java.util.Scanner;
import Metodos.Recursos;

public class Bingo {

	final static int NUMERO_BOLAS=90;
	final static int FILAS_CARTON=3;
	final static int COLUMNAS_CARTON=9;
	
	static int [][] tableroBingo = new int [9][10];

	public static void mostrarTablero () {

		for(int i = 0; i < tableroBingo.length; i++) {
			for(int j = 0; j < tableroBingo[0].length; j++) {
				if (tableroBingo[i][j]== 0) {
					System.out.print("X\t ");
				}else {
					System.out.println(tableroBingo[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void sacarBola() {
		int bola=Recursos.numAleatorio(NUMERO_BOLAS);
		int fila = bola/10;
		int columna = bola % 10;
		System.out.println("Hemos sacado el: " + bola + " va a la fila: " + fila + " columna: " + columna);
		
		if(columna==0) {
			tableroBingo[fila][tableroBingo[0].length -1]=bola;
		}else {
			tableroBingo[fila][columna -1]= bola;
		}
	}
	
	public static void generarCarton() {
		//ToDo - Work in progress
		int[][] carton = new int[FILAS_CARTON][COLUMNAS_CARTON];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hayBingo;
		
		do {
			sacarBola();
			mostrarTablero();
			
			
			//Repetimos hasta que el administrador ponga una s
			hayBingo=sc.nextLine().toLowerCase();
			
		} while (!hayBingo.equals("s"));
		

	}

}