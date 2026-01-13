package Metodos;

import java.util.Scanner;

public class SumarArrays {
	
	final static int ELEMENTOS=5;
	static Scanner escaner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int  [] v1 = new int[ELEMENTOS];
		int  [] v2 = new int[ELEMENTOS];
		int  [] v3 = new int[ELEMENTOS];
		
		System.out.println("Vamos a dale valores al array 1");
		rellenarArray(v1);
		
		System.out.println("Vamos a dale valores al array 2");
		rellenarArray(v2);
		
		if(v1.length==v2.length) {
			v3=sumaDosArrays(v1,v2);
			mostrarArray(v3);
		}else {
			System.out.println("Los array tienen que ser del mismo tamaño");
		}
		escaner.close();
	}
	
	
	public static void rellenarArray (int arr[]) {
		for (int i=0; i <arr.length; i++) {
			System.out.print("\nIntroduce el elemento " + (i+1) + " =");
			arr[i] = escaner.nextInt();
			
		}

	}
	
	public static int[] sumaDosArrays (int[] v1, int[] v2 ){
		int[] suma = new int[v1.length];
		
		for (int i=0; i <suma.length; i++) {
			suma[i]= v1[i] +v2 [i];
		}
		return suma;	
	}
	
	public static void mostrarArray(int[]array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("elemento{"+ i +"]=" + array[i]);
		}
	}
	
}

