package arays;

import java.util.Arrays;
import java.util.Scanner;
import Metodos.Recursos;

public class OrdenarArray {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime un numero para la dimencio del array: ");
		int dimencion = escaner.nextInt();
		int [] arr = new int [dimencion];
		
		Recursos.rellenarArrayAleatorio(arr,100);
		System.out.println("El array inicial es: ");
		System.out.println("-----------------------------------------");
		Recursos.mostrarArray(arr);
		System.out.println("\nCamenzamos a ordenalo");
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int aux;
					aux=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=aux; 
				}
			}
			//Recursos.mostrarArray(arr);
		}
		System.out.println("Fianlmente queda asi");
		Recursos.mostrarArray(arr);
		escaner.close();
	}
}
