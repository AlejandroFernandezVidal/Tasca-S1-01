package n1exercici1;

public class Corda extends Instrument{
	//Atributs
	private static String nom;
	private static double precio;

	//Constructors
	public Corda() {
		super(nom, precio);
	}
	public Corda(String nom, double precio) {
		super(nom, precio);
	}
	
	static {
		nom = "Donner";
		precio = 120.75;
		System.out.println("BloqStaticCorda");
	}
	
	/*{
		System.out.println("BloqIniCorda");
	}*/
	
	public void tocar() {
		
		System.out.println("Està sonant un instrument de corda");
		
	}
}