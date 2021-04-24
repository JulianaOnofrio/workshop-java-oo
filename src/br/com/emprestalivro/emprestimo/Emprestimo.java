package br.com.emprestalivro.emprestimo;

import br.com.emprestalivro.livros.Livros;
import br.com.emprestalivro.usuario.Usuario;


public class Emprestimo {
    private int codSolicitacao;
    private Usuario usuarioSolicitante;
    private Livros livroEmprestado;
    private String dataSolicitacao;
    private String dataDevolução;

    public Emprestimo(int codSolicitacao, Usuario usuarioSolicitante, Livros livroEmprestado,
                      String dataSolicitacao, String dataDevolução) {

        this.codSolicitacao = codSolicitacao;
        this.usuarioSolicitante = usuarioSolicitante;
        this.livroEmprestado = livroEmprestado;
        this.dataSolicitacao = dataSolicitacao;
        this.dataDevolução = dataDevolução;
    }

    public int getCodSolicitacao() {
        return codSolicitacao;
    }

    public void setCodSolicitacao(int codSolicitacao) {
        this.codSolicitacao = codSolicitacao;
    }

    public Usuario getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    public void setUsuarioSolicitante(Usuario usuarioSolicitante) {
        this.usuarioSolicitante = usuarioSolicitante;
    }

    public Livros getLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(Livros livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getDataDevolução() {
        return dataDevolução;
    }

    public void setDataDevolução(String dataDevolução) {
        this.dataDevolução = dataDevolução;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "codSolicitacao=" + codSolicitacao +
                ", usuarioSolicitante=" + usuarioSolicitante +
                ", livroEmprestado=" + livroEmprestado +
                ", dataSolicitacao=" + dataSolicitacao +
                ", dataDevolução=" + dataDevolução +
                '}';
    }
    public void imprimeDadosEmprestimo(){
        System.out.println("Codigo Emprestimo" + getCodSolicitacao());
    }
}


