package condicionales;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner escanner = new Scanner(System.in);
		int num;
		boolean primo;
		
		System.out.println("Dime un numer positivo o y te digo si es primo o no: ");
		num = escanner.nextInt();
		
		primo=true;
		
		if (num>2) {
			if (num % 2==0) {
				primo=false;
			}else {
				// i+=2; --> i=i*2;
				for (int i=3; i<=(num/2); i+=2 ) {
					if (num%i==0) {
					primo=false;
					break;
					
				}//for
			}//else	
		}//if
		if (primo) {
			System.out.println("El " + num + " es primo");
		}else{
			System.out.println("El numero " + num +  " no es primo");
		}
		
		escanner.close();

	}
	}
}
