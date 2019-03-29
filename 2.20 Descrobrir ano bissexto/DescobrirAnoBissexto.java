import java.util.Scanner;
	
public class DescobrirAnoBissexto {
		
	public static void main(String[] args) {
			
		Scanner entradaAno = new Scanner (System.in);
		System.out.println("Ano: ");
		int ano = entradaAno.nextInt();
			
		if (ano % 400 == 0) {
			System.out.println("O Ano \"" + ano + "\" eh um ano bissexto.");
		} else if (ano % 4 == 0) {
			if (ano % 100 != 0) {
				System.out.println("O Ano \"" + ano + "\" eh um ano bissexto.");
			} else {
				System.out.println("O Ano \"" + ano + "\" nao eh um ano bissexto.");
			}
		} else {
			System.out.println("O Ano \"" + ano + "\" nao eh um ano bissexto.");
		}
	}
}
