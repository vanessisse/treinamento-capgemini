
public class RelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores relacionais: > < <= >= != ==
		
		int num1, num2;
		
		// Testando uma igualdade
		num1 = 10;
		num2 = 10;
		if (num1 == num2) {
			System.out.println("Número 1 e número 2 são iguais");
		}

		// Testando uma desigualdade
		num1 = 10;
		num2 = 30;
		if (num1 != num2) {
			System.out.println("Número 1 e número 2 são diferentes");
		}
		
		// Testando maior
		num1 = 10;
		num2 = 5;
		if (num1 > num2) {
			System.out.println("Número 1 é maior que número 2");	
		} else {
			System.out.println("Número 2 é maior que número 1");
		}
		
		// Operadores lógicos: && (AND), || (OR)
		
		num1 = 10;
		num2 = 5;
		int num3 = 20, num4 = 5;
		if ((num1 > num3) && (num2 == num4)) {
			System.out.println("Primeira opção satisfeita");
		} else {
			System.out.println("Segunda opção satisfeita");
		}
		
		num2 = 10;
		if ((num1 > num3) || (num2 == num4)) {
			System.out.println("Primeira opção satisfeita");
		} else {
			System.out.println("Segunda opção satisfeita");
		}
	}
}
