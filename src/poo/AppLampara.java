package poo;

public class AppLampara {

	public static void main(String[] args) {
		
		Lampara lamparaIkea = new Lampara("Blanca", "IKEA");
		Lampara lamparaPhillips = new Lampara("Rojo", "PHILLIPS");

		lamparaIkea.estado();
		
		lamparaPhillips.encendido();
		lamparaPhillips.estado();
		
		lamparaPhillips.apagado();
		lamparaPhillips.estado();
	}

}
