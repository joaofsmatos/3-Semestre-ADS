package aulas.aula1.ex1;

public class Pessoa {

    private String nome;
    private byte idade;
    private long passos;

    public long getPassos() {
        return passos;
    }

    public void setPassos(long passos) {
        this.passos += passos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public void andar(){
        setPassos(1);
    }

    @Override
    public String toString() {
        return "Pessoa { " +
                "nome = '" + nome + '\'' +
                ", idade = " + idade +
                ", passos = " + passos +
                " }";
    }

}
