package br.com.emprestalivro.usuario;

public class Usuario {

    private int codUsuario;
    private String nome;
    private String dataNascimento;
    private String endereco;

    public Usuario(String nome, String dataNascimento, String endereco) {

        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;

    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codUsuario=" + codUsuario +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}


