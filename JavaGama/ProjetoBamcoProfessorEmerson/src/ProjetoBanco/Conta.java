package ProjetoBanco;

public abstract class Conta {
	
private int numeroDaConta;
private double saldo;


public Conta(int numeroDaConta, double saldo) {
	super();
	this.numeroDaConta = numeroDaConta;
	this.saldo = saldo;
}
public int getNumeroDaConta() {
	return numeroDaConta;
}
public double getSaldo() {
	return saldo;
}

public void mostrarDados() {
	System.out.println(numeroDaConta + ", " + saldo);
}

public double depositar(double valor){ 
	valor =saldo+valor;
	return saldo;
	}

public double sacar(double valor) {
	saldo=saldo-valor;
	return saldo;
}
}
