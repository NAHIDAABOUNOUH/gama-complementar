
public class AppVeiculo {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Chevrolet", "Cruze", 10);
		Veiculo v2 = new Veiculo("WV", "Gol", 15);
		v1.mostrar();
		v2.mostrar();
		System.out.println("Consumo = " + v1.getConsumo());
		System.out.println("Consumo = " + v2.getConsumo());

	}
}
