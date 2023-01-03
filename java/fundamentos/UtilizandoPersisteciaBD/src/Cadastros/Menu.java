package Cadastros;

import java.util.List;

public class Menu {
	public static void main(String[] args) {
		PessoaDao pd = new PessoaDao();
		try {
			// Incluir uma pessoa
			/*
			Pessoa p1 = new Pessoa(1, "Smith", "smith@gmail.com");
			Pessoa p2 = new Pessoa(2, "Steve", "steve@gmail.com");
			pd.incluirPessoa(p1);
			pd.incluirPessoa(p2);
			*/
			
			
			// Alterar uma pessoa
			// Alterar a informação desejada usando .set (classe encapsulada)
			try {
				Pessoa pes = pd.consultarPessoaIndividual(3);
			
				// Se o resultado da consulta retornar null é porque a pessoa não foi encontrada
				if (pes != null) {
						pes.setEmail("smith@gmail.com");
						// Chamando o método que contém o comando update
						pd.alterarPessoa(pes);
				} else {
					System.out.println("Pessoa não encontrada ou falha no acesso ao banco de dados.");
				}
		
				// Listando todas as pessoas
				List<Pessoa> listaPessoas = pd.ListarPessoas();
				for(Pessoa p : listaPessoas){
					System.out.println("Id.: " + p.getIdPessoa());
					System.out.println("Nome : "  +p.getNomePessoa());
					System.out.println("Email : " +p.getEmail());
				}
			}
			catch (Exception ex ){
		        System.out.println("Alguma coisa deu errado no acesso ao banco de dados. Por favor, contate o suporte.");
			}
			
			
			// Excluir uma pessoa    
			// Verificar se a pessoa existe por código
			Pessoa pessoa1 = pd.consultarPessoaIndividual(1);
			
			// Chamando o método que contém o comando delete
			pd.excluirPessoa(pessoa1);
			
			
			// Listando todas as pessoas
			List<Pessoa> listaPessoas = pd.ListarPessoas();
			for(Pessoa p : listaPessoas){
				System.out.println("Id.: " + p.getIdPessoa());
				System.out.println("Nome : "  +p.getNomePessoa());
				System.out.println("E-mail : " +p.getEmail());
			}
			
			
		} catch (Exception e) {
			System.out.println("Error:  " + e.getMessage());
		}		
		
	}
}