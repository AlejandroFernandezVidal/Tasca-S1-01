package n1exercici1;

public class Percusio extends Instrument{
	//Atributos
	private static String nom;
	private static double precio;
	
	//Constructores
	public Percusio() {
		super(nom,precio);
	}

	public Percusio(String nom, double precio) {
		super(nom, precio);
	}
	
	/*{
		System.out.println("BloqIniPercu");	
	}*/
	
	static {
		nom = "Mapex";
		precio = 659.00;
		//System.out.println("BloqStaticPercu");
	}
	
	public void tocar() {
		System.out.println("Està sonant un instrument de percussió");
	}
}