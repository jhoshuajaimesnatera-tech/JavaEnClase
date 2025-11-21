package cadenas;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		final String VOCALES ="aeiouáéíóúAEIOUÁÉÍÓÚ";
		Scanner escaner = new Scanner(System.in);
		System.out.println("Escribe una frase y cuanto las vocales");
		String frase = escaner.nextLine();
		char caracter;
		int numVocales=0;
		
		for(int i = 0; i<=frase.length()-1; i++){
			caracter=frase.charAt(i);
			
			if(VOCALES.indexOf(caracter)>0) {
				numVocales++; 
			}
		}
		System.out.println("\nEn total hay " + numVocales + " vocales");
		escaner.close();
	}

}
