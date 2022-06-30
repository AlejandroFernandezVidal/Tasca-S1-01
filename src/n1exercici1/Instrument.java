package n1exercici1;

public abstract class Instrument {
	//Atributs
	private String nom;
	private double precio;
	
	//Constructor
	public Instrument(String nom, double precio) {
		this.nom = nom;
		this.precio = precio;
	}
	
	/*static {
		System.out.println("Instrumetos");
	}
	{
		System.out.println("Instrumentos2");
	}*/
	
	//Getter
	public String getNom() {
		return this.nom;
	}
	public double getPrecio() {
		return this.precio;
	}
	//Setter
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract void tocar();
}