package ProjetoBanco;
public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(int numeroDaConta, double saldo, double limite) {
		super(numeroDaConta, saldo);
		this.limite = limite;
	}

	@Override
	public double depositar(double valor) {
		if (valor > 0) {

			return super.depositar(valor);
		} else {
			return 0;
		}
	}

@Override
	public double sacar(double valor) {
	double disponivel = getSaldo()+limite;
	if(valor >= -limite && valor <= disponivel) {
		return super.sacar(valor);
}else {
	return 0;
}
}
}