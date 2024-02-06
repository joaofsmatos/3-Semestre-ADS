package aulas.aula1.cadastroaluno;

public class ServicoAluno {

    public Aluno cadastrarAluno(String nome, String ra, float nota1, float nota2) {
        Aluno novoAluno = new Aluno();
        novoAluno.setNome(nome);
        novoAluno.setRa(ra);
        novoAluno.setNota1(nota1);
        novoAluno.setNota2(nota2);
        return novoAluno;
    }

    public void imprimirCadastro(Aluno aluno, float media) {
        System.out.println("[ Nome: " + aluno.getNome() + ", RA: " + aluno.getRa()
                + ", Nota 1: " + aluno.getNota1() + ", Nota 2: " + aluno.getNota2()
                + ", Média: " + media + " ]");
    }

    public float calcularMediaAluno(Aluno aluno) {
        return (aluno.getNota1() + aluno.getNota2()) / 2;
    }

}
