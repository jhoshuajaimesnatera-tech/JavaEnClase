package poo;

import java.util.Scanner;

public class AppTamagotchi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc ;

		System.out.println("¿Como quieres que se llame tu mascota? ");
		String nombre = sc.nextLine();
		Tamagotchi mascota = new Tamagotchi(nombre);

		//mascota.saludo();

		do {

			System.out.println("Elige una de las opciones: ");
			System.out.println("0-Salir: ");
			System.out.println("1-Comer ");
			System.out.println("2-Jugar ");
			System.out.println("3-Dormir ");
			

			opc=sc.nextInt();

			switch (opc) {
			case 0:
				break;
			case 1:
				mascota.comer();
				break;
			case 2:
				mascota.jugar();
				break;
			case 3:
				mascota.dormir();
				break;
			default:
				System.out.println("Opción no válida!");

			}
			
			if(opc!=0) {
				mascota.status();
			}else {
				System.out.println("Adios");
			}
			
		}while(opc != 0);

		
	}
}

		
		

