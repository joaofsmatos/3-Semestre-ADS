package aulas.aula3.ex3;

import javax.swing.*;

public class ServicoPessoa {

    public void sistemaApp() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setSexo("Feminino");
        pessoa.setIdade((byte) 24);
        System.out.println("Ex1:");
        System.out.println(ex1(pessoa.getNome()));
        System.out.println("\nEx2:");
        System.out.println(ex2(pessoa.getNome()));
        System.out.println("\nEx3:");
        System.out.println(ex3(pessoa.getNome(), pessoa.getSexo(), (byte) pessoa.getIdade()) ? "Aceita" : "Não aceita");
        System.out.println("\nEx4:");
        System.out.println(ex4(pessoa.getNome()));
        System.out.println("\nEx5:");
        int[] aeiou = ex5(pessoa.getNome());
        System.out.printf("A = %d \nE = %d \nI = %d \nO = %d \nU = %d \n",aeiou[0],aeiou[1],aeiou[2],aeiou[3],aeiou[4]);
        System.out.println("\nEx6:");
        ex6("João");
        for (int i = 0; i < 4; i++) {
            56
        }
    }

    public static String ex1(String nome) {
        return nome.substring(0, Integer.parseInt(JOptionPane.showInputDialog(null, "Última posição: ")));
    }

    public static String ex2(String nome) {
        String resultado = "";
        for (int i = 0; i < nome.length(); i++) {
            if(i % 2 != 0) resultado += nome.charAt(i);
        }
        return resultado;
    }

    public static boolean ex3(String nome, String sexo, byte idade) {
        return sexo.equalsIgnoreCase("feminino") && idade < 25;
    }

    public static int ex4(String nome) {
        return nome.length();
    }

    public static int[] ex5(String nome) {
        int[] aeiou = new int[5];
        String[] letras = nome.split("");
        for (String letra : letras) {
            switch (letra) {
                case "a" : aeiou[0] += 1;
                    break;
                case "e" : aeiou[1] += 1;
                    break;
                case "i" : aeiou[2] += 1;
                    break;
                case "o" : aeiou[3] += 1;
                    break;
                case "u" : aeiou[4] += 1;
                    break;
            }
        }
        return aeiou;
    }

    public static void ex6(String nome) {
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
    }

}
