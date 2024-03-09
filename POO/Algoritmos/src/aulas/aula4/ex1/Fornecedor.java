package aulas.aula4.ex1;

import javax.swing.*;

public class Fornecedor {

    private String nome, fone;

    public Fornecedor(){
        super();
    }

    public Fornecedor(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "Fornecedor {" + "\nNome = " + nome + "\nFone = " + fone;
    }

}
