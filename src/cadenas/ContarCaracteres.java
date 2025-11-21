package cadenas;

import java.util.Scanner;

public class ContarCaracteres {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		char caracter;
		String frase, aux;
		int contador=0;
		System.out.println("Dime una palabra o frase: " );
		frase = escaner.nextLine();
		
		System.out.println("Dime un caracter y te dire cuantas veces aparece: ");
		//opcion mas limpia caracter=escaner.nextLine().charAts(0);
		aux = escaner.nextLine();
		caracter = aux.charAt(0);
	
		for(int i=0; i< frase.length(); i++) {
			if (frase.charAt(i) == caracter) {
				contador++;
			}
		}
		
		System.out.print("aparece "+ contador + " veces");
		
	escaner.close();
	}

}
