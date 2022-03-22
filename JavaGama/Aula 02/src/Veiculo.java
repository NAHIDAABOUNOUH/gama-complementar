
public class Veiculo {
	private String modelo;
	private String marca;
	private double consumo;

public Veiculo(String marca, String modelo, double consumo) {
	this.marca = marca;
	this.modelo = modelo;
	this.consumo = consumo;
}

public void mostrar() {
System.out.println("marca igual " + marca + " modelo igual " + modelo);	
}

	public double getConsumo() {
		return consumo;
	}
}
