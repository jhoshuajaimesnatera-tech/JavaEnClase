package cadenas;

import java.util.Scanner;

public class PalindromoOInvertir {
	
	public static boolean esPalindromo (String p) {
		for (int i= 0; i<(p.length())/2;i++) {
			if (p.charAt(i)!=p.charAt(p.length()-(i+1))) {
				return false;
			}
		}
		
		return true;
	}
	
	public static String cadenaInvertida (String cadena) {
		
		String cadenaInvertida;
		
		//Cojo un StringBuilder vacío y voy haciendo append caracter a caracter
		
		StringBuilder cadenaTemporal = new StringBuilder();
		
		for(int i=cadena.length()-1;i>=0;i--) {
			cadenaTemporal.append(cadena.charAt(i));
		}
		
		cadenaInvertida = cadenaTemporal.toString();
		
		return cadenaInvertida;
	}

	public static void main(String[] args) {
		// Vamos a pedir al usuario una palabra y le decimos si es o no es palíndromo
		// En caso de que no sea un palíndromo le damos la vuelta a la palabra y se la mostramos
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Dime una palabra y vamos a ver si es o no un palíndromo");
		String palabra=sc.nextLine();
		
		if(esPalindromo(palabra)) {
			System.out.println("Es un palíndromo");
		}else {
			System.out.println("No es un palíndromo, al revés es: " + cadenaInvertida(palabra));
		}
		 sc.close();

	}

}
