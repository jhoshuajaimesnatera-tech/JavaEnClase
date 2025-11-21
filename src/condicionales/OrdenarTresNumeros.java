package condicionales;
import java.util.Scanner;
public class OrdenarTresNumeros {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("escribe un numero: ");
		num1 = numeros.nextInt();
		
		System.out.print("escribe un numero: ");
		num2 = numeros.nextInt();
		
		System.out.print("escribe un numero: ");
		num3 = numeros.nextInt();
		
		if ((num1 >= num2) && (num1 >= num3)) {
			// si estamos aqui num1 es el mas grande 
			if (num2 >= num3) {
				System.out.print(" De mayor a menor: " + num1 + " " + num2 + " " + num3);
			}else {
				System.out.print(" De mayor a menor: " + num1 + " " + num3 + " " + num2);
			}
		}else if (num2 >= num1 && num2 > num3) {
			//si estamos aqui num2 es el mas grande
			if (num1>=num3) {
				System.out.print(" De mayor a menor: " + num2 + " " + num1 + " " + num3);
			}else {
				System.out.print(" De mayor a menor: " + num2 + " " + num3 + " " + num1);
			}
		}else {
			if (num1>=num2) {
				System.out.print(" De mayor a menor: " + num3 + " " + num1 + " " + num2);
			}else {
				System.out.print(" De mayor a menor: " + num3 + " " + num2 + " " + num1);
			}
		}
		numeros.close();

	}

}
