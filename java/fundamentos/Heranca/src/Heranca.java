
public class Heranca {

	public static void main(String[] args) {
		
			Fisica fis = new Fisica();
			fis.nome = "Smith";
			fis.cpf  = "11111111";
			fis.identidade = "1560455";
			fis.situacaoPessoa = "A";
			
			Juridica jur = new Juridica();
			jur.nome = "Smith's Store";
			jur.cnpj = "454577566";
			jur.inscEstadual = "45545454";
			jur.situacaoPessoa = "I";
			
			System.out.println("Dados da Pessoa Física");
			System.out.println(fis.toString());
			
			System.out.println("\nDados da Pessoa Jurídica");
			System.out.println(jur.toString());
	}

}
