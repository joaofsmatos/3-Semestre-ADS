package aulas.aula3.ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exemplo 1 - substring(), split(), toLowerCase(), toUpperCase(), trim()");
        exemplo1();
        System.out.println("Exemplo 2 - concat(), replace()");
        exemplo2();
    }

    public static void exemplo1() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().substring(2, 6));
        System.out.println(sc.nextLine().substring(1));
        String[] caracteres = sc.nextLine().split("");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i]);
        }
        System.out.println();
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i].toLowerCase());
        }
        System.out.println();
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i].toUpperCase());
        }
        System.out.println();
        System.out.println(sc.nextLine().trim());
    }

    public static void exemplo2(){
        String st = "Biologia é o estudo da ciência";
        System.out.println(st);
        System.out.println(st.concat(" que estuda a vida!"));
        System.out.println(st.replace('o', 'a'));
    }

}
