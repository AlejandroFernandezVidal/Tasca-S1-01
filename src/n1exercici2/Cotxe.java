package n1exercici2;

public class Cotxe {
	//Atributs
	private static final String marca = "Kia";
	private static String model;
	private final double potencia;
	
	//Constructor
	public Cotxe(String model, double potencia) {
			//this.marca = marca;//no se puede inicializar en el constructor
			Cotxe.model = model;
			this.potencia = potencia;	
	}
	
	//Getter
	public String getMarca() {
		return Cotxe.marca;
	}
	public String getModel() {
		return Cotxe.model;
	}
	public double getPotencia() {
		return this.potencia;
	}
	//Setter
	/*public void setMarca() {
		this.marca = marca;
	}*/ //no es necesario ya que el final hace que una vez asignado valor no se pueda modifcar
	
	public void setModel(String model) {
		Cotxe.model = model;
	}
	/*public void setPotencia(double potencia) {
		this.potencia = potencia;
	}*/ //no es necesario ya que el final hace que una vez asignado valor no se pueda modifcar
	
	public static void frenar() {
		System.out.println("El vehicle està frenant");
		
	}
	
	public void acelerar() {
		System.out.println("El vehicle està accelerant");
	}
	
	public String toString() {
		return"Cotxe marca " + Cotxe.marca + " model " + Cotxe.model + " amb una potencia de " + this.potencia;
	}
}