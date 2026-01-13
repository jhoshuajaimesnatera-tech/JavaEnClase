package arays;

import java.util.Scanner;

public class SumarArrays {
	
	final static int ELEMENTOS=5;

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int num;
		int  [] v1 = new int[ELEMENTOS];
		int  [] v2 = new int[ELEMENTOS];
		int  [] v3 = new int[ELEMENTOS];

		System.out.println("Dime un numero para guardarlo en el vector1: ");
		for (int i=0; i <v1.length; i++) {
			num = escaner.nextInt();
			v1[i] = num;
		}

		System.out.println("Dime un numero para guardarlo en el vector2: ");
		for (int j=0; j <v2.length; j++) {
			num = escaner.nextInt();
			v2[j] = num;
		}

		for (int k=0; k <v3.length; k++) {
			v3[k]= v1[k] +v2 [k];

			System.out.println(v1[k]+ "+" + v2[k] + "=" + v3[k]);
		}

		escaner.close();
	}

}
