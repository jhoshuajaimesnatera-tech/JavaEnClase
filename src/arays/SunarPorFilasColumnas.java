package arays;

import java.util.Scanner;

public class SunarPorFilasColumnas {

	static Scanner escaner = new Scanner(System.in);

	public static void main(String[] args) {
		int fila, columna;
		System.out.println("Dime el numero de filas:");
		fila = escaner.nextInt();

		System.out.println("Dime el numero de columnas:");
		columna = escaner.nextInt();

		int [][]matriz= new int[fila][columna];

		System.out.println("Vamos a rellenar la matriz: ");
		rellenarMatriz(matriz);

		System.out.println("este es la matriz:");
		mostrarrMatriz(matriz);

		for(int i=0; i<matriz.length;i++) {
			int acumulador=0;
			for(int j=0; j<matriz[0].length;j++) {
				acumulador= acumulador + matriz[i][j];
			}
			System.out.println("\n La fila nº" + (i+1) +" suma: " + acumulador);
		}


		for(int j=0; j<matriz[0].length;j++) {
			int acumulador=0;
			for(int i=0; i<matriz.length;i++) {
				acumulador= acumulador + matriz[i][j];
			}
			System.out.println("\n La columna nº" + (j+1) +" suma: " + acumulador);
		}
		escaner.close();
	}	

	public static void rellenarMatriz(int matriz[][]) {
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				System.out.println("Dime un numero para poner en esta posicion: " + "fila y columna " + (i+1) + "," + (j+1));
				matriz[i][j] = escaner.nextInt();
			}
		}

	}

	public static void mostrarrMatriz (int matriz[][]) {
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
