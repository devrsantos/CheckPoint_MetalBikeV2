package entities;

import entities.exception.MensagemException;

import java.util.ArrayList;
import java.util.List;

public interface ListaProdutos {

    List produtosLista = new ArrayList();

    public void cadProdutoLista(Object item) throws MensagemException;
}
