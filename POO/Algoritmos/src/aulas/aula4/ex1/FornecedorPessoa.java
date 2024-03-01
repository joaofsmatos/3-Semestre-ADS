package aulas.aula4.ex1;

public class FornecedorPessoa extends Fornecedor{

    private String rg, cpf;

    public FornecedorPessoa(){
        super();
    }

    public FornecedorPessoa(String rg, String cpf, String nome, String fone) {
        super(nome, fone);
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Fornecedor Pessoa" +
                "\nRG = " + rg +
                "\nCPF = " + cpf;
    }

}
