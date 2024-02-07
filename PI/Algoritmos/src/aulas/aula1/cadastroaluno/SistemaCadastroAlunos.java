package aulas.aula1.cadastroaluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaCadastroAlunos {

    static Scanner sc = new Scanner(System.in);
    static ServicoAluno servicoAluno = new ServicoAluno();

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<Aluno>();
        while (true) {
            Aluno novoAluno = new Aluno();
            novoAluno = cadastrar();
            alunos.add(novoAluno);
            for (Aluno aluno : alunos) {
                imprimirDadosCadastro(aluno, servicoAluno.calcularMediaAluno(novoAluno));
            }
        }

    }

    public static Aluno cadastrar() {
        String dados[] = new String[4];
        for (int i = 0; i < dados.length; i++) {
            dados[i] = sc.nextLine();
        }
        return servicoAluno.cadastrarAluno(dados[0],dados[1], Float.parseFloat(dados[2]), Float.parseFloat(dados[3]));
    }

    public static void imprimirDadosCadastro(Aluno aluno, float media) {
        servicoAluno.imprimirCadastro(aluno, media);
    }

}
