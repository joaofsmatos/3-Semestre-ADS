package aulas.projetos.projeto2;

import java.util.ArrayList;
import java.util.Arrays;

public class Vetor {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("João");
        lista.add("Francisco");
        lista.add("Patricia");
        lista.add("Leticia");
        System.out.println(lista.size());
        System.out.println(lista.toString());
        System.out.println(lista.get(1));
        System.out.println(lista.set(0, "Marco Aurelio"));
        System.out.println(lista.set(2, "Alexandre"));
        System.out.println(lista.toString());
    }

}