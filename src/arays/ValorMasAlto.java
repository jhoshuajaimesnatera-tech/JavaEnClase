package arays;

public class ValorMasAlto {

	public static void main(String[] args) {
		int[] arr = {31, 65, 37, 85, 17};
		int valorAlto= arr[0];
		int valorBajo= arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > valorAlto) {
				 valorAlto = arr[i] ;
			}else if(arr[i]<valorBajo) {
				valorBajo= arr[i];
			}
		}
		System.out.println("Este es el valor mas Alto: "+ valorAlto +" y este es el mas bajo: "+ valorBajo);
	}

}
