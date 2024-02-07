package aulas.aula1.exercicios;

import java.util.Scanner;

public class Exercicio {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        calculadora();
    }

    public static void calculadora(){
        int opcao;
        do {
            System.out.println("1) para adição");
            System.out.println("2) para subtração");
            System.out.println("3) para multiplicação");
            System.out.println("4) para divisão");
            System.out.println("0) sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 : System.out.println("RESPOSTA: " + adicao(lerNum1(), lerNum2()));
                    break;
                case 2 : System.out.println("RESPOSTA: " + sub(lerNum1(), lerNum2()));
                    break;
                case 3 : System.out.println("RESPOSTA: " + mult(lerNum1(), lerNum2()));
                    break;
                case 4 : podeDividir(lerNum1(), lerNum2());
                    break;
                default : System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static double lerNum1() {
        System.out.println("Digite número 1: ");
        return sc.nextDouble();
    }

    public static double lerNum2() {
        System.out.println("Digite número 2: ");
        return sc.nextDouble();
    }

    public static double adicao(double n1, double n2) {
        return  n1 + n2;
    }

    public static double sub(double n1, double n2) {
        return  n1 - n2;
    }

    public static void podeDividir(double n1, double n2) {
        while (n2 == 0) {
            System.out.println("Digite novamente o divisor!");
            n2 = sc.nextDouble();
        }
        System.out.println("RESPOSTA: " + divisao(n1, n2));
    }
    public static double divisao(double n1, double n2) {
        return  n1 / n2;
    }
    public static double mult(double n1, double n2) {
        return n1 * n2;
    }
}