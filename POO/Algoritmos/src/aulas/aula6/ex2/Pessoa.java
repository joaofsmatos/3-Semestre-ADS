package aulas.aula6.ex2;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private byte idade;

    public Pessoa(String nome, byte idade) {
        this.nome = nome;
        this.idade = idade;
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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pessoa) {
            Pessoa p = (Pessoa) obj;
            return this.getNome().equalsIgnoreCase(p.getNome()) && this.getIdade() == p.getIdade();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

}
