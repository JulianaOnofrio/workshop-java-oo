package br.com.emprestalivro.livros;

public class Livros {

    private int codLivro;
    private String nome;
    private String autor;

        public Livros(int codLivro, String nome, String autor) {

            this.codLivro = codLivro;
            this.nome = nome;
            this.autor = autor;

        }

    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livros(int codLivro) {
        this.codLivro = codLivro;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "codLivro=" + codLivro +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
