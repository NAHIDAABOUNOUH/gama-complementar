import java.util.Scanner;

public class OlaMundo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a hora.");
		int hora;
		hora = teclado.nextInt();
		teclado.close();
		if (hora <= 12) {
			System.out.println("Bom-dia.");
		} else {
			if (hora > 12 && hora <= 18) {
				System.out.println("Boa tarde.");
			} else {
				System.out.println("Boa noite.");
			}
		}
	}
}
