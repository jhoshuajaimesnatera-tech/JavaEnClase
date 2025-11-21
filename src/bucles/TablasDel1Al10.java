package bucles;

public class TablasDel1Al10 {

	public static void main(String[] args) {
		int multiplicacion;
		for(int i=1;i<=10; i++) {
			for(int b = 1; b<=10; b++) {
				multiplicacion=(i*b);
				System.out.println(i + "*" + b + "=" + multiplicacion );
			}
			System.out.println("-----------");
		}

	}

}
