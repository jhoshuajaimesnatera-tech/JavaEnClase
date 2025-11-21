package condicionales;

import java.util.Scanner;

public class ParOImpar {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);
		System.out.print("Ingresa un numero y te digo si es par o no:");
		int num = escaner.nextInt();
		
		escaner.close();
		
		if(num % 2 ==0) {
			System.out.print("El numero: " + num + " es par");
		} else {
			System.out.print("El numero: " + num + " es impar");
		}
	}

}
