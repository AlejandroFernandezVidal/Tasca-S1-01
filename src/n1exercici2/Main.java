package n1exercici2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cotxe cotxe = new Cotxe("Ceed", 1.5);
		
			cotxe.acelerar();//Accedemos mediante el objeto creado.		
			Cotxe.frenar();//Accedemos mediante la clase pq es static y es la manera correcta, aunque se podría acceder mediante el objeto también.

		System.out.println(cotxe.toString());
		}
	}