package bucles;
import java.util.Scanner;
public class PsitivosONgativos {

	public static void main(String[] args) {
		Scanner escanner = new Scanner(System.in);
		System.out.println("Dime cuantos numeros me vas a dar: ");
		int num, num2;
		num = escanner.nextInt();
		int positivos=0;
		int negativos=0;
		int cero=0;
		for (int i = 1; i<=num; i++) {
			System.out.println("Dime un numero: " + i +"/"+ num);
			num2 = escanner.nextInt();
			
			if(num2>0) {
				positivos++;
			}else if (num2<0) {
				negativos++;
			}else {
				cero++;
			}
		}
		
		System.out.println("en total han sido: ");
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.println("Ceros: " + cero);
		
		escanner.close();
	}

}
