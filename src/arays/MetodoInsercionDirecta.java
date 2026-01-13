package arays;

import java.util.Scanner;
import Metodos.Recursos;

import java.util.Scanner;

public class MetodoInsercionDirecta {

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
		
		//busca el minicmo y su posicion
		for(int i=0; i<arr.length;i++) {
			int menor=arr[i];
			int posicion=i;
			for(int j=i; j<arr.length;j++) {
				if(menor>arr[j]) {
					menor=arr[j];
					posicion=j;
				}
			}
			System.out.println("tengo al mas pequeño: " + menor + " y esta es la posicion: " + posicion);
			arr[posicion]=arr[i];
			arr[i]=menor;
			Recursos.mostrarArray(arr);
		}
	}

}
