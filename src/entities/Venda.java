package entities;

import entities.exception.MensagemException;

public class Venda extends ProdutoUnitario {

    private double valorProduto;
    private double cashback;
    private double desconto;
    private String cliente;
    private String categoriaCliente;

    public Venda(double valorProduto, String nome_produto, String modelo_produto, String fabrincante_produto, double valor_produto, String cliente, String categoriaCliente) {
        super(nome_produto, modelo_produto, fabrincante_produto, valor_produto);
        this.cliente = cliente;
        this.categoriaCliente = categoriaCliente;
        this.valorProduto = valor_produto;
    }

    public void calculaCashback() throws MensagemException {
        System.out.println(getCategoriaCliente());

        if (getCategoriaCliente() == "1") {
            setCashback((getValor_produto() * 0.05));
        } else if (getCategoriaCliente() == "2") {
            setDesconto((getValor_produto() * 0.03));
        }
        else throw new MensagemException("{\n" +
                "Error: Categoria Inválida" +
                "\n}");
    }

    public String nomeCategoria() {
         if (categoriaCliente == "1") {
             return "Pessoa Física";
         }
        if (categoriaCliente == "2") {
            return "Pessoa Jurídica";
        }
        if (categoriaCliente == "3") {
            return "Colaborador";
        }
        return null;
    };

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }

    public double getCashback(double cashback) {
        return cashback;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getCategoriaCliente() {
        return categoriaCliente;
    }

    public void setCategoriaCliente(String categoriaCliente) {
        this.categoriaCliente = categoriaCliente;
    }

    @Override
    public String toString() {
        return "Venda: " +
                "Valor do Produto: " + valorProduto +
                " | Cashback: " + cashback +
                " | Desconto: " + desconto +
                " | Cliente: '" + cliente + '\'' +
                " | Categoria: '" + nomeCategoria() + '\'' +
                ";\n\n" + super.toString();
    }
}
