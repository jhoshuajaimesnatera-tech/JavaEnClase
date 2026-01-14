package poo;

public class Tamagotchi {
	
	private String nombre;
	private int hambre;
	private int energia;

	public Tamagotchi(String nombre) {
		this.nombre=nombre;
		this.hambre=0;
		this.energia=100;
	}
	
	public Tamagotchi(String nombre, int hambre, int energia) {
		this.nombre=nombre;
		this.hambre=hambre;
		this.energia=energia;
	}
	
	public void status() {
		System.out.println("tu mascota " + nombre + " tiene " + hambre + " de hambre y " + energia + " de energia");
	}
	
	public void comer() {
		if(hambre <=10) {
			this.hambre=0;
		}else {
			this.hambre-=10;
		}
	}
	
	public void jugar() {
		if (this.energia>=20) {
			this.hambre+=15;
			this.energia-=20;
		}else {
			System.out.println("No puedo jugar estoy cansado y necesito una siesta");
		}
	}
	
	public void dormir() {
		this.energia=100;
	}
}
