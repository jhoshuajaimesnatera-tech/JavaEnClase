package bucles;

import java.util.Scanner;

public class SiONo {

	public static void main(String[] args) {
		Scanner escanner = new Scanner(System.in);
		
		String opc;
		
		do {
			System.out.println("¿Quieres continuar? s/n");
			opc=escanner.nextLine();
			
		}while (!opc.equals("s"));
		
		escanner.close();
	}

}
