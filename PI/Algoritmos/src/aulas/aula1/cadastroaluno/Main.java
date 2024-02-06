package aulas.aula1.cadastroaluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Cadastro cadastro = new Cadastro();
    static Media media = new Media();

    public static void main(String[] args) {
        do {
            Aluno novoAluno = new Aluno();
            novoAluno = cadastro.cadastrarAluno(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            media.calculoMedia(novoAluno.getNota1(), novoAluno.getNota2());
            listarDeAlunos(novoAluno);
        }while (sc.nextInt() != 0);
    }

    public static void listarDeAlunos(Aluno aluno){
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno);
    }

}
