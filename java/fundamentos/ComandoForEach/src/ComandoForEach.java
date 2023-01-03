public class ComandoForEach {
	public static void main(String[] args) {
		// Lendo os elementos do vetor usando For Each
		
		int[] vetorNumeros = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		// Varrendo o vetor sem uso do For Each
		
		System.out.println("\nVarrendo o vetor sem For Each");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Número: " + vetorNumeros[i]);
		}
		
		// Varrendo o vetor usando For Each
		
		System.out.println("\nVarrendo o vetor usando For Each");
		for (int obj : vetorNumeros) {
			System.out.println("Número: " + obj);
		}
	}
}