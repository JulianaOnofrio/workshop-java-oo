package br.com.emprestalivro;

import br.com.emprestalivro.emprestimo.Emprestimo;
import br.com.emprestalivro.livros.Livro;
import br.com.emprestalivro.usuario.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestaUsuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome Completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua data de Nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        Usuario usuario = new Usuario(1l, nome, dataNascimento, endereco);

        usuario.imprimeUsuario();

        System.out.println("\n\n\nDigite o nome do livro: ");
        String nomeLivro = scanner.nextLine();

        System.out.println("Digite o nome do autor do livro: ");
        String autorLivro = scanner.nextLine();

        Livro livro = new Livro(1l, nomeLivro, autorLivro);
        livro.imprimeLivro();

        System.out.println("\n\n\nDigite a data do empréstimo: ");
        String dataEmprestimo = scanner.nextLine();

        System.out.println("Digite a data da devolução: ");
        String dataDevolucao = scanner.nextLine();

        Emprestimo emprestimo = new Emprestimo(1L, usuario, livro, dataEmprestimo, dataDevolucao);
        emprestimo.imprimeEmprestimo();

        boolean invalido = true;

        while (invalido) {
            System.out.println("\n\n\nDigite a data do empréstimo: ");
            dataEmprestimo = scanner.nextLine();

            System.out.println("Digite a data da devolução: ");
            dataDevolucao = scanner.nextLine();

            LocalDate localDateEmprestimo = LocalDate.parse(dataEmprestimo, DateTimeFormatter.ISO_DATE);
            LocalDate localDateDevolucao = LocalDate.parse(dataDevolucao, DateTimeFormatter.ISO_DATE);

            if (localDateDevolucao.isBefore(localDateEmprestimo)) {
                invalido = true;
                System.out.println("A data da devolução deve ser depois da data do empréstimo");
            } else {

            }
        }
        Emprestimo emprestimo1 = new Emprestimo(1L, usuario, livro, dataEmprestimo, dataDevolucao);
        emprestimo.imprimeEmprestimo();
    }
}