package arays;

import java.util.Scanner;
import java.util.Scanner;

import Metodos.Recursos;

public class OrdenarArrayInsercion {
	
	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime un numero para la dimencio del array: ");
		int dimencion = escaner.nextInt();
		int [] arr = new int [dimencion];
		
		Recursos.rellenarArrayAleatorio(arr,100);
		
		for(int i =1; i < arr.length; i++) {
			System.out.println("vamos a por el elemento: " + arr[i]);
			int j=i;
			do {
				System.out.println("Voy a comparar " + arr[j] + " a ver si es mas pequeño que " + arr[j-1]);
				if(arr[j] < arr[j-1]) {
					//los intercambio
					int aux=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=aux;
					j--;
				}else {
					//Acabo ya esta ordenado
					break;
				}
			}while(j>=1);
		}
		Recursos.mostrarArray(arr);
		
		escaner.close();
	}
}
