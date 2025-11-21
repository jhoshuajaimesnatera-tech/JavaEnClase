package bucles;
import java.util.Scanner;
public class DiasSemana {

	public static void main(String[] args) {
		Scanner Dia = new Scanner(System.in);
		 int dia;
		 System.out.print("Dime un numero del del 1 al 7 y te dire el dia de la semana: ");
		 dia = Dia.nextInt();
		 
		 switch (dia) {
		 	case 1:
		 		System.out.print("Es Lunes");
		 	break;
		 	
		 	case 2:
		 		System.out.print("Es Martes");
	
		 	break;
		 	
		 	case 3:
		 		System.out.print("Es Miercoles");
		 	break;
		 	
		 	case 4:
		 		System.out.print("Es Jueves");
		 	break;
		 	
		 	case 5:
		 		System.out.print("Es Viernes");
		 	break;
		 	
		 	case 6:
		 		System.out.print("Es Sabado");
		 	break;
		 	
		 	case 7:
		 		System.out.print("Es Domingo");
		 	break;
		 	
		 	default:
		 		System.out.print("No es un dia de la semana");
		 }
		
		Dia.close();

	}

}
