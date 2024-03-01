package aulas.aula4.ex4;

public class Pessoa {

    private String nome;
    private String endereco;
    private String tel;
    private int idade;

    public Pessoa(String nome, String endereco, String tel, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.tel = tel;
        this.idade = idade;
    }

    @Override
    public String toString() {
         return  "Pessoa:" +
                "\nnome: " + nome +
                "\nendereco: " + endereco +
                "\ntelefone: " + tel +
                "\nidade: " + idade;
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("João Francisco", "Rua 8", "1195320-2366", 19);
        String str = p.toString();
        System.out.println(str + "\n");
        System.out.println(p);
    }

}
