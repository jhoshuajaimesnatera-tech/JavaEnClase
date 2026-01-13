package arays;

public class Diagonal {

	public static void main(String[] args) {
		final int DIMENSION=5;
		int [][] matriz = new int [DIMENSION][DIMENSION];
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz.length;j++) {
				if(j==i) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=0;
				}
			}
		}

		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[0].length;j++) {
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.println(" ");
		}
	}
}
