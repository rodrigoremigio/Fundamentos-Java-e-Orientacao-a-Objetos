public class TrabalhandoComStrings {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int z = x + y;
		// Concatenação Resultado + z
		System.out.println("Resultado: " + z);
		System.out.println("Resultado: " + x + y); // Aqui os números são concatenados, não somados
		System.out.println("Resultado: " + (x + y)); // Devido os parênteses, os números são somados.
		System.out.println(x + y + " foi o Resultado."); // Aqui são somados.
		
		String nome = "Cris";
		int idade = 23;
		System.out.println(nome + " tem " + idade);
	}
}