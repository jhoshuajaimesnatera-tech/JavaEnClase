package cadenas;

import java.util.Scanner; 

public class SiONo {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String opc;
		
		do {
			System.out.println("¿Quieres continuar? (s/n)");
			opc = escaner.nextLine().toLowerCase();
		
		}while(!opc.equals("s") && !opc.equals("n"));
		// while(!(opc.equals("s") || opc.equals("n")));
		
		System.out.println("Hasta luego, un placer");
		
		escaner.close();

	}

}
