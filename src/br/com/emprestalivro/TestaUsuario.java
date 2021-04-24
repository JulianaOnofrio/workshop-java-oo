package br.com.emprestalivro;

import br.com.emprestalivro.emprestimo.Emprestimo;
import br.com.emprestalivro.livros.Livros;
import br.com.emprestalivro.usuario.Usuario;

public class TestaUsuario {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juliana", "08/12/1991", "Rua Doutor João Batista de Lacerda,402");
        Livros livro1 = new Livros(1, "Como programar", "Deitel");
        Emprestimo emprestimo = new Emprestimo(1, usuario1, livro1, "18/04/2021", "20/04/2021");

        System.out.println(emprestimo.toString());

    }

}
