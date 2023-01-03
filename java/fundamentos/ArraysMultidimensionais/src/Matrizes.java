import javax.swing.JOptionPane;

public class Matrizes {

	public static void main(String[] args) {
		/*
		 Escreva um algoritmo que solicite ao usuário a entrada de 4 notas para cada aluno. 
		 Calcular a média dos alunos e exibir na tela.
		 Ao final, mostrar a média da turma. 
		 Ao lado da média do aluno, deve seguir a seguinte regra de negócio:
		 Se média >= 7,5           Aprovado
		 Se média >= 5,5 e < 7,5   Recuperação
		 Se média < 5,5            Reprovado
		 */
		
		// Vetor dos alunos
		String [] alunos = {"MÁRIO","JOSÉ","LUIS"};
	
		// Matriz das notas
		float [][] notas = new float[3][4];
		
		// Para controlar o somatório das notas de cada aluno
		// Para calcular a média do aluno
		float somaNotas, mediaAluno;
		// Para armazenar o status do aluno e usar para imprimir o boletim depois
		String statusAluno;
		
		// Informar as notas dos alunos
		// Laço externo para associar o aluno à nota
		for (int i = 0; i < 3; i++) {
			// Laço interno para informar as notas de cada aluno
			somaNotas = 0;
			mediaAluno = 0;
			for (int j = 0; j < 4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nº " + (j+1) + " do aluno " + alunos[i]));
			    somaNotas = somaNotas + notas[i][j];
			}
			mediaAluno = somaNotas / 4;
			if	(mediaAluno < 5.5) {
				statusAluno = "REPROVADO";
			} else if (mediaAluno >= 5.5 && mediaAluno <= 7.5) {
				statusAluno = "RECUPERAÇÃO";
			} else {
				statusAluno = "APROVADO";
			}
			// Impressão do boletim
			System.out.println("\n************ BOLETIM *************");
			System.out.println("Aluno: " + alunos[i]);
			System.out.println("Notas");
			for (int j1 = 0; j1 < 4; j1++) {
				System.out.println((j1+1) + " - " + notas[i][j1]);
			}
			System.out.println("Média: " + mediaAluno + " - " + statusAluno);
		}
	}
}
