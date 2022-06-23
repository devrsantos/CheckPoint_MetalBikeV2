package entities;

public class Cliente extends Pessoa{
    public Cliente(String nome, String sobrenome, String telefone, String email, String cpf, String categoriaCliente) {
        super(nome, sobrenome, telefone, email, cpf, categoriaCliente);
    }

    @Override
    public String toString() {
        return "Cliente{} " + super.toString();
    }
}
