package entities;

import entities.exception.MensagemException;

public class Produtos extends ProdutoUnitario implements ListaProdutos{

    public Produtos() {
        super();
    }

    public Produtos(String nome_produto, String modelo_produto, String fabrincante_produto, double valor_produto) {
        super(nome_produto, modelo_produto, fabrincante_produto, valor_produto);
    }

    @Override
    public void cadProdutoLista(Object Produto) {
        produtosLista.add(Produto);
    }

    public boolean acessProdutoLista() throws MensagemException {
        if (produtosLista.size() != 0) {
            for (int i = 0; i < produtosLista.size(); i++) {
                System.out.println(produtosLista.get(i));
            }
        } else {
            throw new MensagemException("{\n" +
                        "Error: A Lista de Produtos está Vázia" +
                    "\n}");
        }
        return false;
    }
}
