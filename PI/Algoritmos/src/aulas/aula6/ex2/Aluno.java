package aulas.aula6.ex2;

public class Aluno implements Comparable {

    private String nome;
    private final long RA;

    public Aluno(String nome, long ra) {
        this.nome = nome;
        this.RA = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getRA() {
        return RA;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Aluno aluno) {
            return this.getNome().equalsIgnoreCase(aluno.getNome()) && this.getRA() == aluno.getRA();
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        Aluno aluno = (Aluno) o;
        if (this.getNome().compareTo(aluno.getNome()) != 0) {
            return this.getNome().compareTo(aluno.getNome());
        } else {
            return Long.compare(this.getRA(), aluno.getRA());
        }
    }

    @Override
    public int hashCode() {
        return (int) this.RA + this.getNome().hashCode();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", RA=" + RA +
                '}';
    }

}
