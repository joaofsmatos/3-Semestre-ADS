package ados.ado1;

import javax.swing.*;
import java.util.Arrays;

public class ServicoMatriz {

    public void imprimirMatriz(int[][] matriz) {
        JOptionPane.showMessageDialog(null, Arrays.deepToString(matriz));
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

    public void menu() {
        do {
            Matriz matriz = new Matriz();
            int[][] matrizQuadrada = matriz.criarMatriz(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a ordem da matriz?")));
            matriz.preencherMatriz(matrizQuadrada);
            JOptionPane.showMessageDialog(null, "O maior número da matriz: " + maiorMatriz(matrizQuadrada));
            JOptionPane.showMessageDialog(null, "O menor número da matriz: " + menorMatriz(matrizQuadrada));
            JOptionPane.showMessageDialog(null, "A soma da DP da matriz: " + somarDP(matrizQuadrada));
            JOptionPane.showMessageDialog(null, "A soma da DS da matriz: " + somarDS(matrizQuadrada));
            JOptionPane.showMessageDialog(null, "A soma total dos valores: " + somarTotal(matrizQuadrada));
            imprimirMatriz(matrizQuadrada);
        } while (JOptionPane.showInputDialog(null, "Deseja criar outra matriz? (S/N)").equalsIgnoreCase("s"));
    }

}
