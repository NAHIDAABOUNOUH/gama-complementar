import java.util.Scanner;

public class Exercicio01 {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	
	double nota1;
	double nota2 ;
	System.out.println("Informe a primeira nota.");
	nota1 = teclado.nextDouble();
	System.out.println("Digite a segunda nota");
	nota2 = teclado.nextDouble();
	double media = (nota1+nota2)/2;

	System.out.println("A primeira nota foi" + nota1);
	System.out.println("A segunda nota foi " + nota2);
	System.out.println("Portanto, a média final foi " + media);
	teclado.close();
}
}
