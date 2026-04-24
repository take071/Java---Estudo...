import java.time.Year;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private String genero;
    private int numPaginas;

    public Livro(String titulo, String autor, String editora,
                 int anoPublicacao, String genero, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    public String classificarLivro() {
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoPublicacao;

        if (idade > 500) {
            return "Antigo";
        } else if (idade < 100) {
            return "Moderno";
        } else {
            return "Tradicional";
        }
    }

    public int calcularDiasEmprestimo() {
        if (numPaginas <= 50) {
            return 4;
        } else if (numPaginas <= 300) {
            return 7;
        } else {
            return 14;
        }
    }
}
