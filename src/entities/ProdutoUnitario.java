package entities;

public abstract class ProdutoUnitario {

    private String nome_produto;
    private String modelo_produto;
    private String fabrincante_produto;
    private double valor_produto;

    public ProdutoUnitario() {

    }

    public ProdutoUnitario(String nome_produto, String modelo_produto, String fabrincante_produto, double valor_produto) {
        this.nome_produto = nome_produto;
        this.modelo_produto = modelo_produto;
        this.fabrincante_produto = fabrincante_produto;
        this.valor_produto = valor_produto;
    }

    @Override
    public String toString() {
        return "ProdutoUnitario{" +
                "nome_produto='" + nome_produto + '\'' +
                ", modelo_produto='" + modelo_produto + '\'' +
                ", fabrincante_produto='" + fabrincante_produto + '\'' +
                ", valor_produto=" + valor_produto +
                '}';
    }
}
