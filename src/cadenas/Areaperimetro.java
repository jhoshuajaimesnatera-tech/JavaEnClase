package cadenas;

public class Areaperimetro {
	
	public static double perimetro(double radio) {
		return 2*Math.PI*radio;
	}
	
	public static double area(double radio) {
		double area=Math.PI*radio*radio;
		return area;
	}
	
	public static void main(String[] args) {
		
		double r =5;
		double p;
		
		//guardamos el valor devuelto por el metodo
		p = perimetro(r);
		System.out.println("El perimetro es " + p);
				
		//utilizamos directamente el valor que me devuelve el metodo
		System.out.println("El area es " + area(r));

	}

}
