package cadenas;

import java.util.Scanner;

public class CambiarAPor4 {
	
	public static String cambiaA (String f) {
		// codigo con StringBuider 
		StringBuilder aux = new StringBuilder();
		
		for(int i=0; i < f.length(); i++) {
			//System.out.println(f.charAt(i));
			if (f.charAt(i)=='a'|| f.charAt(i)=='A') {
				aux.append('4');
			}
		}
		// con esto transformamos el StringBuilder a String
		return aux.toString();
	}

	
	public static String replaceMejorado (String f, char viejo, char nuevo) {
		// codigo con StringBuider 
		StringBuilder aux = new StringBuilder();
		
		for(int i=0; i < f.length(); i++) {
			//System.out.println(f.charAt(i));
			if (f.charAt(i)==Character.toLowerCase(viejo) || f.charAt(i)==Character.toUpperCase(viejo)) {
				aux.append(nuevo);
			}else {
				aux.append(f.charAt(i));
			}
			
		}
		
		return aux.toString();
	}

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime una frase: ");
		
		String frase= escaner.nextLine();
		String fraseSinA = frase.replace('a', '4');
		System.out.println("La frase: " + frase + " modificada es: " + fraseSinA);
		
		escaner.close();
		
		String  fraseSinAMetodo = cambiaA(frase); 
		System.out.println("La frase: " + frase + " modificada es: " + fraseSinAMetodo);
		
		String fraseSinEMetodo = replaceMejorado(frase, 'e', '3');
		System.out.println("La frase: " + frase + " modificada es: " + fraseSinEMetodo);
		
	}

}
