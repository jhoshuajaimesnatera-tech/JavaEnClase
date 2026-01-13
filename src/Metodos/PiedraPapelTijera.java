package Metodos;

import java.util.Scanner;

public class PiedraPapelTijera {
	
	static Scanner escaner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] arrayOpciones= {"Piedra", "Papel","Tijera"};
		String opcion = arrayOpciones[pedirOpc()-1];
		String opcionPc =arrayOpciones [eleccionPc()-1];
		
		
		System.out.println("El jugador eligio: " + opcion + " y el PC eligio: " + opcionPc);
		escaner.close();
		
		if(opcion.equals(opcionPc)){
			System.out.println("Empate");
		}else if((opcion.equals("Papel") && opcionPc.equals("Piedra"))|| 
				(opcion.equals("Piedra") && opcionPc.equals("Tijera")) || 
				(opcion.equals("Tijera") && opcionPc.equals("Papel"))){
			System.out.println("Ganaste");
		}else {
			System.out.println("Perdiste");
		}

	}
	
	public static int pedirOpc() {
		int opc;
		System.out.println("opcion 1 = piedra");
		System.out.println("opcion 2 = papel");
		System.out.println("opcion 3 = tijera");
		
		do {
			opc= escaner.nextInt();
			if(opc<=0||opc>3) {
				System.out.println("Revisa tu opcion");
			}
		}while(opc<=0|| opc>3);
		
		return opc;
	}
	
	public static int eleccionPc () {
		int eleccion = (int)(Math.random()*3)+1;
		return eleccion;
	}

}
