
public class Polimorfismo {

	public static void main(String[] args) {
	
		Mamifero mamifero1 = new Elefante();
		System.out.println("Cota diária de consumo leite de um elefante: " + mamifero1.cotaDiariaLeite());

		Mamifero mamifero2 = new Rato();
		System.out.println("Cota diária de consumo de leite de um rato: " + mamifero2.cotaDiariaLeite());
	}

}
