package aulas.aula4.ex1;

import javax.swing.*;

public class Fornecedor {

    private String nome, fone;

    public static void main(String[] args) {
        Fornecedor fornecedorPessoa = new FornecedorPessoa(
            JOptionPane.showInputDialog(null, "RG: "),
            JOptionPane.showInputDialog(null, "CPF: "),
            JOptionPane.showInputDialog(null, "Nome: "),
            JOptionPane.showInputDialog(null, "Fone: ")
        );
        Fornecedor fornecedorEmpresa = new FornecedorEmpresa(
            JOptionPane.showInputDialog(null, "Nome: "),
            JOptionPane.showInputDialog(null, "Fone: "),
            JOptionPane.showInputDialog(null, "IE: "),
            JOptionPane.showInputDialog(null, "CNPJ: ")
        );
        JOptionPane.showMessageDialog(null, fornecedorPessoa);
        JOptionPane.showMessageDialog(null, fornecedorEmpresa);
    }

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
        return "Fornecedor " + "\nNome = " + nome + "\nFone = " + fone;
    }

}
