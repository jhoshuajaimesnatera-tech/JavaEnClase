package arays;

import java.util.Scanner;

public class ImprimirHasta0 {

	static Scanner escaner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int [10];


		System.out.println("Vamos a rellenar el array:");
		rellenarArray(arr);
		
		System.out.println("este es el array:");
		mostrarrArray(arr);
		escaner.close();

	}

	public static void rellenarArray (int arr[]) {
		int i=0;
		do {
			System.out.println("Dime un numero para rellenar el array");
			arr[i]= escaner.nextInt();
			i++;
		}while(arr[i-1]>0 && i<(arr.length));
	}
	public static void mostrarrArray (int arr[]) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<=0) {
				break;
			}else {
				System.out.println("elemento{"+ i +"]=" + arr[i]);
			}
		}
	}
}


