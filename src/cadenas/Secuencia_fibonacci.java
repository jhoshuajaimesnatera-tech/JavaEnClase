package cadenas;

import java.util.Scanner;

public class Secuencia_fibonacci {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("¿cuantos terminos de la secuencia de fibonacci quieres ver?");
		int terminos = escaner.nextInt();
		int antepenultimo = 0; 
		int penultimo = 1;
		int actual;
		System.out.println("El ternimo numero 1 es 0 \nEl termino numero 2 es 1 ");
		
		for (int i =3; i<=terminos; i++) {
			actual= penultimo + antepenultimo;
			System.out.println("el termino numero " + i + " es " + actual);
			antepenultimo = penultimo;
			penultimo = actual;
		}
	
		escaner.close();

	}

}
