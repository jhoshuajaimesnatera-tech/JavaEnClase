package poo;

public class Superheroe {
	
	private String nombre;
	private String superpoder;
	private boolean capa;
	
	public Superheroe(String nombre, String Superpoder) {
		this.nombre=nombre;
		this.superpoder=Superpoder;
		this.capa=true;
	}
	
	public void describricion() {
		System.out.print("Su nombre " + nombre + " superpoder " + superpoder);
		if(this.capa) {
			System.out.println(" y lleva capa");
		}else {
			System.out.println(" y no lleva capa");
		}
	}

}
