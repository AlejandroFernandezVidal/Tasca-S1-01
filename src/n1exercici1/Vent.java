package n1exercici1;

public class Vent extends Instrument{
	//Atributos
	private static String nom;
	static private double precio;
	
	//Constructores
	public Vent () {
		super(nom, precio);
	}
	public Vent (String nom, double precio) {
		super(nom, precio);
	}
	
	static {
		nom = "Hohner";
		precio = 7.28;
		//System.out.println("BloqStaticVent");
	}
	
	/*{
		System.out.println("BloqIniVent");
	}*/
	
	
	public void tocar() {
		System.out.println("Està sonant un instrument de vent");
	}
}