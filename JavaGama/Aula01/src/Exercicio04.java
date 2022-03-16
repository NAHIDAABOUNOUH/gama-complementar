import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tabuada;
		System.out.println("Informe a tabuada");
		tabuada = teclado.nextInt();
		int numero = 0;
		int resultado;

		teclado.close();
		while (numero <= 10) {
			resultado = numero * tabuada;
			System.out.println(numero + "x" + tabuada + "=" + resultado);
			numero++;
		}
	}
}
