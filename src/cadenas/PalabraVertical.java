package cadenas;

import java.util.Scanner;

public class PalabraVertical {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		char caracter;
		System.out.print("Dime una palabra o frase: ");
		String cadena = escaner.nextLine();
		
		
		//con el metodo charAt 
		for (int i=0; i< cadena.length(); i++) {
			caracter=cadena.charAt(i);
			System.out.println(caracter);
		}
		
		System.out.println();
		
		//con el metodo substring
		String caracter2;
		for (int i=0; i< cadena.length(); i++) {
			caracter2=cadena.substring(i, i+1);
			System.out.println(caracter2);
		}
		
		
		escaner.close();

	}

}
