package bucles;
import java.util.Scanner;
public class TableMultiplicar {

	public static void main(String[] args) {
		Scanner escanner = new Scanner(System.in);
		int num, multiplicacion;
		
		System.out.println("Dime la el numero de la tabla que quieres ver: ");
		num = escanner.nextInt();
		
		for (int i = 1; i<=10; i++){
			multiplicacion = (num*i);
			System.out.println(multiplicacion);
		}
		
		escanner.close();

	}

}
