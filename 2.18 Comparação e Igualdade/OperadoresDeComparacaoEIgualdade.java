public class OperadoresDeComparacaoEIgualdade {
	
	public static void main(String[] args) {
		
		// Comparação: > (maior), >= (maior ou igual), < (menor), <= (menor ou igual)
		// Igualdade: == (igual) e != (diferente)
		
		int a = 10;
		int b = 5;
		int c = 2;
		
		boolean maior = b > a;
		boolean maiorOuIgual = b >= a;
		boolean menor = a < b;
		boolean menorOuIgual = a <= 10;
		boolean igual = a == b - c;
		boolean diferente = a != c;
		
		System.out.println("Maior: " + maior);
		System.out.println("Maior ou igual: " + maiorOuIgual);
		System.out.println("Menor: " + menor);
		System.out.println("Menor ou igual: " + menorOuIgual);
		System.out.println("Igual: " + igual);
		System.out.println("Diferente: " + diferente);
		
		boolean bloqueado = true;
		
		bloqueado = !bloqueado; //O "!" inverte o valor da variável ou operação booleana.
		System.out.println(bloqueado);
	}
}