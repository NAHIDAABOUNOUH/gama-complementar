import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);

		int contador;
		System.out.println("Informe o número");
      contador = teclado.nextInt();
      int numero = 0;
teclado.close();
while (numero <= contador) {
	System.out.println(numero);
numero++;	
}
	}
}
