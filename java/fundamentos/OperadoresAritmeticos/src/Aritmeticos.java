
public class Aritmeticos {

	public static void main(String[] args) {
		int num1, num2, num3;
	
		// Soma
		num1 = 15;
		num2 = 20;
		num3 = num1 + num2;
		System.out.println("O resultado da soma é: " + num3);
		
		// Subtração
		num1 = 15;
		num2 = 20;
		num3 = num1 - num2;
		System.out.println("O resultado da subtração é: " + num3);
		
		// Multiplicação
		num1 = 15;
		num2 = 20;
		num3 = num1 * num2;
		System.out.println("O resultado da multiplicação é: " + num3);
		
		// Divisão
		num1 = 20;
		num2 = 2;
		num3 = num1 / num2;
		System.out.println("O resultado da divisão é: " + num3);
		System.out.println("\n------------------------------------\n");
		// Incrementando (somando de 1 em 1)
		num1 = 1;
		while (num1 <= 10) {
			System.out.println(num1);
			num1++;
		}
		System.out.println("\n------------------------------------\n");
		// Decrementando (subtraindo de 1 em 1)
		num1 = 10;
		while (num1 > 0) {
			System.out.println(num1);
			num1--;
		}	
	}

}
