package arays;

public class ArrayAleatorio {

	public static void main(String[] args) {
		int [] arr = new int[10];
		//
		int numeroPensado;
		
		for(int i= 0; i < arr.length; i++) {
			numeroPensado= (int) (Math.random()*100);	
			arr[i]=numeroPensado;
			//System.out.println(arr[i]);
			System.out.println(arr[i]+" su cuadrado es: "+ (int)Math.pow(arr[i], 2) + " su cubo es: " + (int)Math.pow(arr[i], 3));
		}
	}

}
