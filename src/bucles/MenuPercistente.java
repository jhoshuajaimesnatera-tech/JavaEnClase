package bucles;

import java.util.Scanner;

public class MenuPercistente {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int opc;
		String nombre;
		
			
			
		do {
			System.out.println("MENU");
			System.out.println("1 Saludo");
			System.out.println("2 La hora");
			System.out.println("3 Agradecer");
			System.out.println("4 Salir");
			System.out.println("Dime tu opcion: ");
			
			opc = escaner.nextInt();
			//Limpianos el buffer
			escaner.nextLine();
			 switch (opc) {
			 	case 1:
			 		
			 		System.out.println("Dime tu nombre: ");
			 		
			 		nombre = escaner.nextLine();
			 		
			 		System.out.println("Hola " + nombre);
			 	break;
			 	
			 	case 2:
			 		System.out.print("La hora es: 19:52");
		
			 	break;
			 	
			 	case 3:
			 		System.out.println("Dime tu nombre: ");
			 		nombre = escaner.nextLine();
			 		System.out.println("Gracias " + nombre);
			 	break;
			 }
		}while(opc!=4);
	
		
		escaner.close();	
		
		}
	}


