package cadenas;

import java.util.Scanner;

public class TablamultiplicaMetodo {
	
	public static void mostrarTabla (int num) {
		
		for (int i = 1; i<=10; i++){
			int multiplicacion = num*i;
			System.out.println(num +"*"+i+"="+multiplicacion);
		}
	}

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime un numero y muestro su tabla de multiplicar:");
		int numero = escaner.nextInt();
		
		// mostrarTabla(numero);
		for (int i=1; i<=numero; i++) {
			mostrarTabla(i);
			System.out.println("-----------------");
		}
		
		escaner.close();
		

	}

}
