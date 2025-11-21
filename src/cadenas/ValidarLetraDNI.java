package cadenas;

import java.util.Scanner;

public class ValidarLetraDNI {
	final static String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static boolean dniValido(String dni) {
		//asumimos que los 8 primeros son numeros 
		String dniSinletra;
		dniSinletra=dni.substring(0,8);
		char letra=dni.charAt(dni.length()-1);
		//System.out.println("el dni es "+ dni + " y sin letra "+ dniSinletra + " esta es la letra " + letra);
		int dniNumerico = Integer.valueOf(dniSinletra);
		//System.out.println("el DNI en numeros es "+ dniNumerico);
		
		// calcula la letra buena 
		char letraBuena;
		int resto = dniNumerico%23;
		letraBuena = LETRAS.charAt(resto);
		//System.out.println("El resto da: "+ resto+ " y letras buenas seria " + letraBuena);
	
		if(letra == letraBuena){
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Escribe tu DNI: ");
		String dni = escaner.nextLine();
		if(dniValido(dni)) {
			System.out.println("La letra es correcta");
		}else {
			System.out.println("La letra es incorrecta");
		}
		
		escaner.close();
	}

}
