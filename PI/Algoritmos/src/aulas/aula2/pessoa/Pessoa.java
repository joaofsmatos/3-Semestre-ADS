package aulas.aula2.pessoa;

public class Pessoa {
    private String nome;
    private byte idade;
    private String endereco;

    // Construtor Padrão
    public Pessoa() {
        super();
    }

    // Construtor Alternativo
    public Pessoa(String nome, byte idade, String endereco) {
        setNome(nome);
        setIdade(idade);
        setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.equalsIgnoreCase("")) this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        if(idade > 0) this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(!endereco.equalsIgnoreCase("")) this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "nome = '" + nome + '\'' +
                ", idade = " + idade +
                ", endereco = '" + endereco + '\'' +
                '}';
    }

}
