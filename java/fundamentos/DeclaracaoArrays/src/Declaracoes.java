
public class Declaracoes {

	public static void main(String[] args) {
        // [ ] são inseridos em uma variável que referencia um array
        int[] numeros = new int [4];
        
        // Outro modo de declarar um array
        int[] numeros2;
        numeros2 = new int[10];
        
        // Declarando diversos arrays
        int[] numeros3 = new int[44], numeros4 = new int[23];

        // { } inicializa valores em um array
        int[] iniciaValores = {12, 32, 54, 6, 8, 89, 64, 64, 6};

        // Declarando um array de inteiros
        int[] meuArray;

        // Memória para 10 inteiros
        meuArray = new int[10];

        // Inicializa o primeiro elemento
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;
        // meuArray [10] = 564;
        // Um erro ocorre, pois não há índice [10]
        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
    }
}
