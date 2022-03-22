
public class Ebook {
private String titulo;
private String autor;
private double totalDePaginas;
private double paginaAtual;

public Ebook (String titulo, String autor, double totalDePaginas) {
	this.titulo = titulo;
	this.autor = autor;
	if(totalDePaginas != 0) {
		this.totalDePaginas = totalDePaginas;
	}
}

public int getPaginaAtual(){
    return paginaAtual;
}

public void avancarPagina() {
	if(paginaAtual < totalDePaginas) {
		paginaAtual++;
	}
}

public void voltarPagina() {
	if(paginaAtual > 0) {
		paginaAtual--;
	}
}

public String mostrarDados() {
	return titulo + ", " + autor + ", " + totalDePaginas;
}
}
