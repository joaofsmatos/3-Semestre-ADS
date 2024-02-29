package aulas.aula3.cadastropessoa;

public class Pessoa {

    private String nome;
    private String telefone;
    int sexo;
    public static int MASCULINO = 1;
    public static int FEMININO = 2;

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

}
