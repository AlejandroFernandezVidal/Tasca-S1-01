package n2exercici1;

public class Telefon {
	//Atributos
	private String marca;
	private String model;
	
	//Constructor
	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}
	
	//Getter
	public String getMarca() {
		return this.marca;
	}
	public String getModel() {
		return this.model;
	}

	//Setter
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	//General
	
	public static void trucar(String numero) {
		System.out.println("Està trucant al número de telèfon " + numero);
		
	}
}