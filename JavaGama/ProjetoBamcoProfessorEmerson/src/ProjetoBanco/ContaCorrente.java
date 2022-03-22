package ProjetoBanco;
public class ContaCorrente extends Conta {
	public ContaCorrente(int numeroDaConta, double saldo) {
		super(numeroDaConta, saldo);
	}

	@Override
	public double sacar(double valor) {
		if (valor > 0 && valor <= getSaldo()) {

			return super.sacar(valor);
		} else {
			return getSaldo();
		}
	}

	@Override
	public double depositar(double valor) {
		if (valor > 0) {

			return super.depositar(valor);
		} else {
			return 0;
		}
	}
}