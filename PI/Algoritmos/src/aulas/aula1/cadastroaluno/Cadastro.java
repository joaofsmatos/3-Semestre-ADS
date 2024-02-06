package aulas.aula1.cadastroaluno;

public class Cadastro {

    public Aluno cadastrarAluno(String nome, String ra, double nota1, double nota2) {
        Aluno novoAluno = new Aluno();
        novoAluno.setNome(nome);
        novoAluno.setRa(ra);
        novoAluno.setNota1(nota1);
        novoAluno.setNota2(nota2);
        return novoAluno;
    }

    public void imprimirCadastro(Aluno aluno) {
        System.out.println("Nome: " + aluno.getNome() + " RA: " + aluno.getRa());
    }

}
