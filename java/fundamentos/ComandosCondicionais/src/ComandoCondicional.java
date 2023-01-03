
public class ComandoCondicional {

	public static void main(String[] args) {
		// If
		
		int num1 = 10, num2 = 30;
		if (num1 < num2) {
			System.out.println("if normal: número 1 é menor que número 2");
		}
		
		if (num1 > num2) {
			System.out.println("if com else: número 1 é maior que número 2");			
		} else {
			System.out.println("if com else: número 1 é menor que número 2");
		}
		
		// Condição composta 1
		if (num1 > num2) {
			System.out.println("Condição composta 1: número 1 é maior que número 2");	
		} else if (num1 < num2) {
			System.out.println("Condição composta 1: número 1 é menor que número 2");	
		} else {
			System.out.println("Condi��o composta 1: número 1 é igual ao número 2");
		}

		// Condição composta 2
		num1 = 10;
		num2 = 10;
		if (num1 > num2) {
			System.out.println("Condição composta 2: número 1 é maior que número 2");	
		} else if (num1 < num2) {
			System.out.println("Condição composta 2: número 1 é menor que número 2");	
		} else {
			System.out.println("Condição composta 2: número 1 é igual ao número 2");
		}

		// Comando condicional SWITCH

		char opcao = '4';

		switch (opcao) {
			case '1': {
				System.out.println("\nChame programa de inclusão");
				break;
			}
			case '2': {
				System.out.println("\nChame programa de alteração");
				break;
			}
			case '3': {
				System.out.println("\nChame programa de exclusão");
				break;
			}
			case '4': {
				System.out.println("\nChame programa de consulta");
				break;
			}
		}
	}
}
