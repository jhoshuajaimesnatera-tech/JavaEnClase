package poo;

public class Lampara {
	private String color;
	private String marca;
	private boolean estaEncendida;
	
	public Lampara (String color, String marca) {
		this.color=color;
		this.marca=marca;
	}
	
	public void estado() {
		System.out.println("Aqui tenemos una lampara " + marca + " de color " + color);
		if(estaEncendida = true) {
			System.out.println(" y esta encendida");
		}else {
			System.out.println(" y esta apagada");
		}
	}
	
	public void encendido() {
		this.estaEncendida=true;
	}
	
	public void apagado() {
		this.estaEncendida=false;
	}

}
