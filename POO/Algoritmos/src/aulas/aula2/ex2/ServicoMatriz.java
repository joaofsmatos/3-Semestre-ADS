package aulas.aula2.ex2;

import java.util.Random;
import java.util.Scanner;

public class ServicoMatriz {

    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz.length; j++) {
                if(j == matriz.length - 1) System.out.print(matriz[i][j]);
                else System.out.print(matriz[i][j] + ",");
            }
            System.out.println("]");
        }
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
        Random rdm = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rdm.nextInt(10);
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

    public static void matrizQuadrada() {
        ServicoMatriz servicoMatriz = new ServicoMatriz();
        Matriz matrizQuadrada = new Matriz();
        Scanner sc = new Scanner(System.in);
        int[][] matriz = matrizQuadrada.criarMatriz(sc.nextInt());
        servicoMatriz.preencherMatriz(matriz);
        System.out.println("O maior número da matriz: " + servicoMatriz.maiorMatriz(matriz));
        System.out.println("O menor número da matriz: " + servicoMatriz.menorMatriz(matriz));
        System.out.println("A soma da DP da matriz: " + servicoMatriz.somarDP(matriz));
        servicoMatriz.imprimirMatriz(matriz);
    }

}
