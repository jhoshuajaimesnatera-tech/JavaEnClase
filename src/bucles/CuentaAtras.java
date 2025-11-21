package bucles;
import java.util.Scanner;
public class CuentaAtras {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int contador, num;
		
		System.out.println("Dime un numero y hare la cuenta hacia atras");
		num = escaner.nextInt();
		contador= num;
		
		escaner.close();
		
		System.out.println("este es con un buble while: ");
		while (contador > 0){
			System.out.print(contador + ", ");
			contador--;
		}
		System.out.println("0. ");
		
		System.out.println("este es con un buble do: ");
		contador=num;
		do {
			System.out.print(contador + ", ");
			contador--;
		}while(contador >0);
		System.out.println("0. ");
		
		System.out.println("este es con un buble for: ");
		for (int i=num; i>0; i--) {
			System.out.print(i + ", ");
		}
		System.out.println("0. ");
	}

	
}
