package arays;

public class SumarAray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int suma = 0;
		for( int i=0; i< arr.length;i++) {
			// la variable del bucle me indica una posicion del array, tengo que acceder al contenido 
			suma = suma + arr[i] ;
		}
		System.out.println("esta es la suma: "+ suma);
	}
	
}
