
public class AppEbook {
	public static void main(String[] args) {
		Ebook AppEbook = new Ebook("A Moreninha", "Machado de Assis", 180);

		System.out.println(AppEbook.mostrarDados());
		AppEbook.avancarPagina();
		System.out.println(AppEbook.getPaginaAtual());
		AppEbook.voltarPagina();
	}
}
