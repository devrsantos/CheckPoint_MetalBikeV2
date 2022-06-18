import entities.ProdutoUnitario;
import entities.Produtos;
import entities.exception.MensagemException;

public class Programa {
    public static void main(String[] args) throws MensagemException {

        Produtos p1 = new Produtos();

        Produtos prod1 = new Produtos("Barra Forte", "Monark", "1958", 750.00);

        p1.cadProdutoLista(prod1);

        p1.acessProdutoLista();
    }
}
