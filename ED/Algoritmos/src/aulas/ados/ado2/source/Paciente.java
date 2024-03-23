package aulas.ados.ado2.source;

public class Paciente {

    private String nome;
    private String tipo;

    public Paciente(String nome, String senha) {
        this.nome = nome;
        this.tipo = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String senha) {
        this.tipo = senha;
    }

}
