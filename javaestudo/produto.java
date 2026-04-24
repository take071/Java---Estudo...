public class Produto {
    private int codigo;
    private String nome;
    private double precoCusto;
    private int estoque;

    public Produto(int codigo, String nome, double precoCusto, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.estoque = estoque;
    }

    public double calcularPrecoVenda(double percentualLucro) {
        return precoCusto + (precoCusto * percentualLucro / 100);
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
        }
    }

    public void abastecerEstoque(int quantidade) {
        estoque += quantidade;
    }
}
