
public class FolhaDePagamento {
public static void main(String[] args) {
	Funcionario f1 = new Funcionario();
	Funcionario f2= new Funcionario();
	Funcionario f3 = new Funcionario();

	f1.setNumeroFuncional(1234);
	f1.setNome ("Nahida Ali Abou Nouh");
	f1.setCargo("Analista Jr.");
	f1.setSalario(5535.87);
	
	f2.setNumeroFuncional(2345);
	f2.setNome("José da Silva");
	f2.setCargo("Aux. de atendimento");
	f2.setSalario(1837.63);
	
	f3.setNumeroFuncional(3456);
	f3.setNome("Maria Santos");
	f3.setCargo("Operador de caixa");
	f3.setSalario(1212.00);
	
f1.mostrarDados();	
f2.mostrarDados();
f3.mostrarDados();

f1.aumentarSalario(10);
f1.mostrarDados();
}
}
