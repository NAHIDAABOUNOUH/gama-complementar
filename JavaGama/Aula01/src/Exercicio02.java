import java.util.Scanner;

public class Exercicio02 {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	
	double salarioBruto;
	double prestacao;
	double limite;
	
	System.out.println("Informe seu sal�rio");
	salarioBruto = teclado.nextDouble();
	System.out.println("Qual � o valor da parcela?");
	prestacao = teclado.nextDouble();
	limite = salarioBruto*0.3;
	teclado.close();
	
	if (prestacao <= limite) {
		System.out.println("Cr�dito concedido");
	}else {
		System.out.println("Desculpe, cr�dito n�o concedido");
	}
}
}
