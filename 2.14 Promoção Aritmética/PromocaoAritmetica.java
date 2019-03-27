public class PromocaoAritmetica {
	
	public static void main(String[] arg) {
		int x = 10;
		int y = 5;
		int z = x + y;
		System.out.println("Soma: " + z);
		
		int a = 10;
		long b = 5;
		long c = a + b; // A variável a é promovida para long
		System.out.println("Soma: " + c);
		
		long d = 10;
		float e = 9.34F;
		float f = d * e; // Apesar de longe ter maior capacidade que float, "d" passa a ser float.
		System.out.println("Multiplicação: " + f);
	}
}