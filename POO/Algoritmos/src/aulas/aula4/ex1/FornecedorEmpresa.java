package aulas.aula4.ex1;

public class FornecedorEmpresa extends Fornecedor{

    private String ie, cnpj;

    public FornecedorEmpresa() {
        super();
    }

    public FornecedorEmpresa(String nome, String fone, String ie, String cnpj) {
        super(nome, fone);
        this.ie = ie;
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "\nFornecedor Empresa {" +
                "\n   nome = " + getNome() +
                "\n   fone = " + getFone() +
                "\n   rg = " + ie +
                "\n   cnpj = " + cnpj +
                "\n}\n";
    }
}
