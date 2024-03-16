package aulas.aula6.ex2;

public class TestePessoa {

    public static void main(String[] args) {
        System.out.println(compararPessoa(new Pessoa("João", (byte)19),new Pessoa("Pedro", (byte)19)) ? "É a mesma pessoa" : "Não é a mesma pessoa");
        System.out.println(compararPessoa(new Pessoa("João", (byte)19),new Pessoa("João", (byte)19)) ? "É a mesma pessoa" : "Não é a mesma pessoa");
        System.out.println(new Pessoa("João", (byte)19).hashCode() == new Pessoa("João", (byte)19).hashCode() ? "Sim" : "Não");
    }

    public static boolean compararPessoa(Pessoa p1, Pessoa p2) {
        return p1.equals(p2);
    }

}
