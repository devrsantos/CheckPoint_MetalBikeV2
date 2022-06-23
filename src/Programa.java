import entities.*;
import entities.exception.MensagemException;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws MensagemException {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome do Produto");
        String nome = teclado.next();

        System.out.println("Informe o modelo do Produto");
        String modelo = teclado.next();

        System.out.println("Informe o fabricante do Produto");
        String fabricante = teclado.next();

        System.out.println("Informe o valor do Produto");
        double valor = teclado.nextDouble();
        Produtos p1 = new Produtos();

        Produtos prod1 = new Produtos(nome, modelo, fabricante, valor);

        // Descomentar
        p1.cadProdutoLista(prod1);

        // Descomentar
        p1.acessProdutoLista();

        System.out.println("Informe o nome do Cliente");
        String nomeCliente = teclado.next();

        System.out.println("Informe o sobrenome do Cliente");
        String sobrenomeCliente = teclado.next();

        System.out.println("Informe o telefone do Cliente");
        String telefoneCliente = teclado.next();

        System.out.println("Informe o e-mail do Cliente");
        String emailCliente = teclado.next();

        System.out.println("Informe o CPF do Cliente");
        String cpfCliente = teclado.next();

        System.out.println("Informe a categoria do Cliente");
        String categoriaCliente = teclado.next();

        Cliente c1 = new Cliente(nomeCliente, sobrenomeCliente, telefoneCliente,emailCliente, cpfCliente, categoriaCliente);

        Venda v1 = new Venda(prod1.getValor_produto(), prod1.getNome_produto(), prod1.getModelo_produto(), prod1.getFabrincante_produto(), prod1.getValor_produto(), c1.getCpf(), c1.getCategoriaCliente());

        v1.calculaCashback();

        System.out.println(v1);

        teclado.close();
    }
}
