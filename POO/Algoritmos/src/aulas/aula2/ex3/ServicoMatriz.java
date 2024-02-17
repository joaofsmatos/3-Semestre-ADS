package aulas.aula2.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class ServicoMatriz {

    public void imprimirMatriz(int[][] matriz) {
        System.out.println(Arrays.deepToString(matriz));
    }

    public int maiorMatriz(int[][] matriz) {
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(maior < matriz[i][j]) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public int menorMatriz(int[][] matriz) {
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(menor > matriz[i][j]) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public void preencherMatriz(int[][] matriz){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite o número da coluna " + j + " da linha " + i);
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public int somarDP(int[][] matriz) {
        int somaDP = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDP += matriz[i][i];
        }
        return somaDP;
    }

    public int somarDS(int[][] matriz) {
        int somaSP = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaSP += matriz[i][matriz.length - i - 1];
        }
        return somaSP;
    }

    public int somarTotal(int[][] matriz) {
        int somaTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                somaTotal += matriz[i][j];
            }
        }
        return somaTotal;
    }

    public static void matrizQuadrada() {
        ServicoMatriz servicoMatriz = new ServicoMatriz();
        Scanner sc = new Scanner(System.in);
        boolean continuar;
        do {
            Matriz matrizQuadrada = new Matriz();
            System.out.println("Qual a ordem da matriz?");
            int[][] matriz = matrizQuadrada.criarMatriz(sc.nextInt());
            servicoMatriz.preencherMatriz(matriz);
            System.out.println("O maior número da matriz: " + servicoMatriz.maiorMatriz(matriz));
            System.out.println("O menor número da matriz: " + servicoMatriz.menorMatriz(matriz));
            System.out.println("A soma da DP da matriz: " + servicoMatriz.somarDP(matriz));
            System.out.println("A soma da DS da matriz: " + servicoMatriz.somarDS(matriz));
            System.out.println("A soma total dos valores: " + servicoMatriz.somarTotal(matriz));
            servicoMatriz.imprimirMatriz(matriz);
            System.out.println("Deseja criar uma nova matriz? ");
            continuar = sc.next().equalsIgnoreCase("S");
        } while (continuar);
    }

}
