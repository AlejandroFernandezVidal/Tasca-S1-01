package n1exercici1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Instrument> instruments = new ArrayList<Instrument>();
		
		//Primero se incia el bloque static de la superclase al instanciar un objeto de la subclase, luego inicia el bloque static de la subclase
		//una única vez ambos bloques staticos.Después los bloques de inicializacion de la superclase y de las subclases tantas veces como objetos instanciemos.
		//Independientemente del orden en el que están distribuidos en la superclase y las subclases.
		
		Corda guitarra = new Corda("Yamaha", 109.90);
		instruments.add(guitarra);
		//Corda guitarra2 = new Corda();
		//instruments.add(guitarra2);
		
		Vent flauta = new Vent();
		instruments.add(flauta);
		//Vent flauta2 = new Vent();
		//instruments.add(flauta2);
		
		Percusio bateria = new Percusio();
		instruments.add(bateria);
		//Percusio bateria2 = new Percusio();
		//instruments.add(bateria2);
		
		System.out.println(guitarra.getNom());
		System.out.println(guitarra.getPrecio());
		//System.out.println(guitarra2.getNom());
		//System.out.println(guitarra2.getPrecio());
		
		System.out.println(flauta.getNom());
		System.out.println(flauta.getPrecio());
		//System.out.println(flauta2.getNom());
		//System.out.println(flauta2.getPrecio());
		
		System.out.println(bateria.getNom());
		System.out.println(bateria.getPrecio());
		//System.out.println(bateria2.getNom());
		//System.out.println(bateria2.getPrecio());
		
		guitarra.tocar();
		//guitarra2.tocar();
		flauta.tocar();
		//flauta2.tocar();
		bateria.tocar();
		//bateria2.tocar();
	}
}