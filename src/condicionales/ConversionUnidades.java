package condicionales;
import java.util.Scanner;
public class ConversionUnidades {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		double velocidad, conversion;
		int opcion;
		
		System.out.println("¿A que velocidad vas?");
		velocidad = escaner.nextDouble();
		
		System.out.println("¿Y de que unidades estamos hablando? ");
		System.out.println(" 1 Km/h");
		System.out.println(" 2 m/s");
		opcion = escaner.nextInt();
		escaner.close();
		if (opcion==1){
			conversion = velocidad* 1000/3600;
			System.out.print("vas a: " + velocidad + "Km/h y eso equivale a: " + conversion + "m/s");
		}else {
			conversion = velocidad / 1000/3600;
			System.out.print("vas a: " + velocidad + "m/s y eso equivale a: " + conversion + "Km/h");
		}
	}

}
