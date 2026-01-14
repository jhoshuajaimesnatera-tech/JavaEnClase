package poo;

public class Termometro {
	private double temperatura;
	private String tipo;
	
	public Termometro(double temperatura) {
		setTemoeratura(temperatura);
	}
	
	public Termometro(double temperatura, String tipo) {
		setTemoeratura(temperatura);
		this.tipo=tipo;
	}
	
	public double getTemperatura() {
		return this.temperatura;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTemoeratura(double temperatura) {
		if(temperatura >=273.15) {
			this.temperatura=temperatura;
		}else {
			System.out.println("No es fisicamente posible bajar del 0 basoluto");
		}
	}
}
