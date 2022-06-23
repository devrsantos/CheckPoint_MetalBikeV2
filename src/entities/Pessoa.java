package entities;

public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private String cpf;
    private String categoriaCliente;

    public Pessoa(String nome, String sobrenome, String telefone, String email, String cpf, String categoriaCliente) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.categoriaCliente = categoriaCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCategoriaCliente() {
        return categoriaCliente;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
