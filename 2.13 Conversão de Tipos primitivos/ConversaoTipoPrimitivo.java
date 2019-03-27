public class ConversaoTipoPrimitivo {
	
	public static void main(String[] args) {
		long x = 9300000035L;
		// Fazendo o casting
		int y = (int) x;
		System.out.println(y);
		
		int a = 102344;
		// Aqui o casting é feito automaticamente.
		long b = a;
		System.out.println(b);
		
		double r = 20.5;
		// Fazendo o casting
		float s = (float) r;
		System.out.println(s);
		
		float c = 834.5F;
		// Aqui o casting é feito automaticamente.
		double d = c;
		System.out.println(d);
		
		double largura = 100;
		// Fazendo o casting
		int tamanho = (int) largura;
		System.out.println(tamanho);
		
		double altura = 200.37;
		// Fazendo o casting
		int medida = (int) altura;
		System.out.println(medida);
	}
}