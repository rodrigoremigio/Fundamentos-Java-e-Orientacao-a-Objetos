public class TipoPrimitivo {

	public static void main(String [] args) {
		// Trabalhando com casas decimais
		double precoProduto = 9.43;
		
		// Booleano
		boolean alunoMatriculado = true; // Não funciona ... = 1 (1 referente a true)
		boolean clienteBloqueado = false; // Não funciona ... = 0 (0 referente a true)
		
		// Tipo Char - deve ser entre aspas simples
		char turmaAluno1 = 'A';
		char tipoCliente = '2';
		char simbolo = '@';
		
		// Diferença entre int e long
		long populacaoUberlandia = 650000;
		System.out.println("População de Uberlândia: " + populacaoUberlandia);
		
		long populacaoMundial = 7000000000L;
		// O "L" informa que esse literal é do tipo long, pois sem o "L" ele é identificado como int, mesmo sendo do tipo long.
		// Isso ocorre devido o tamanho que cada variável suporta
		System.out.println("População mundial: " + populacaoMundial);
		
		// Float
		float saldoConta = 1030.43F;
		// O "F" informa que esse literal é do tipo float, pois sem o "F" ele é identificado como double, mesmo sendo do tipo float.
		// Isso ocorre devido o tamanho que cada variável suporta
		System.out.println("Saldo da Conta: " + saldoConta);
	}

}