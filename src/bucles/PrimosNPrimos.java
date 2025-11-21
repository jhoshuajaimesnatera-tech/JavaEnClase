package bucles;
 
import java.util.Scanner;
 
public class PrimosNPrimos {
 
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
 
		//suponemos que el usuario pide al menos 3 primos
		//suponemos tamb que el 1 y el 2 son primos
		//vamos a hacer alguna que otra chapuza
		
		//chapuza
		int contadorPrimos = 2; //ya estan el 1 y el 2
		int contadorNumeros = 3;
		
		System.out.print("cuantos primos quieres que te muestre ");
		int cuantosPrimos = entrada.nextInt();
 
		//escribo por pantalla los dos primeros primos (chapuza)
		System.out.print("1, 2, ");
 
		do {
			boolean esPrimo=true;
			
			for (int i=3; i<=(contadorNumeros/2); i+=2) { //se crea el i en el for y solo existira dentro de este	
				if (contadorNumeros%i == 0) {
					esPrimo=false;
					break;
				}//if
			}//for
 
			if(esPrimo) {
				contadorPrimos++;
				System.out.print(contadorNumeros + ", ");
			}
			contadorNumeros+=2;
 
		} while (contadorPrimos < cuantosPrimos);
 
		entrada.close();
		
	}
}