package aulas.aula4.ex3;

public class Teste {

    public static void main(String[] args) {
        SuperClasse superClasse = new SuperClasse();
        SubClasse subClasse = new SubClasse();
        superClasse.metodoImprimir();
        subClasse.metodoImprimir();
        System.out.println(superClasse);
        System.out.println(subClasse);
    }

}
