package aulas.aula3.cadastropessoa;

public class ServicoPessoa {

    Pessoa pessoa;

    public void criarHomem(){
        pessoa = new Pessoa();
        pessoa.setSexo(Pessoa.MASCULINO);
    }

    public void criarMulher(){
        pessoa = new Pessoa();
        pessoa.setSexo(Pessoa.FEMININO);
    }

}
