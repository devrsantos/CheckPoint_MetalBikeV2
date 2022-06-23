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

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getModelo_produto() {
        return modelo_produto;
    }

    public void setModelo_produto(String modelo_produto) {
        this.modelo_produto = modelo_produto;
    }

    public String getFabrincante_produto() {
        return fabrincante_produto;
    }

    public void setFabrincante_produto(String fabrincante_produto) {
        this.fabrincante_produto = fabrincante_produto;
    }

    public double getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }

    @Override
    public String toString() {
        return "ProdutoUnitario: " +
                "nome_produto= '" + nome_produto + '\'' +
                "| modelo_produto= '" + modelo_produto + '\'' +
                "| fabrincante_produto= '" + fabrincante_produto + '\'' +
                "| valor_produto= " + valor_produto +
                ';';
    }
}
