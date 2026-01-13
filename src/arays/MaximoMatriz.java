package arays;

import java.util.Scanner;

public class MaximoMatriz {
	
	static Scanner escaner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int fila,columna;
		
		System.out.println("Dime el numero de filas que quieres: ");
		fila = escaner.nextInt();
		
		System.out.println("Dime el numero de Columnas que quieres: ");
		columna= escaner.nextInt();
		
		int [][] matriz = new int [fila][columna];
		
		System.out.println("Vamos a rellenar la matriz");
		rellenarMatriz(matriz);
		
		System.out.println("este es la matriz:");
		mostrarrMatriz(matriz);
		
		System.out.println("Este es el numero maximo:" + maximoNumero(matriz));
		
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
			// con la matriz[0] evitamos que tengan que ser de la misma longitud columnas y filas
			for(int j=0;j<matriz[0].length;j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int maximoNumero(int matriz[][]) {
		int maximo= matriz[0][0];
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				if(maximo < matriz[i][j]) {
					maximo=matriz[i][j];
				}
			}

		}
		return maximo;
	}
}	
	

	
	
