package poo;

public class AppTermometro {

	public static void main(String[] args) {
		Termometro termometro1 = new Termometro(400, "Infrarrojo");
		
		System.out.println("el termometro marca " + termometro1.getTemperatura() + " grados " + termometro1.getTipo());
		
		termometro1.setTemoeratura(2000);
		System.out.println("el termometro marca " + termometro1.getTemperatura() + " grados");
	}

}
