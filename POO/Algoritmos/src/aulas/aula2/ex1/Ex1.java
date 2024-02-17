package aulas.aula2.ex1;

import javax.swing.*;

public class Ex1 {
    public static void main(String[] args) {
        int[][] matriz = {
                {10, 52, 45, 63},
                {25, 35, 31, 98},
                {50, 60, 28, 34},
                {65, 30, 90, 27}
        };
        StringBuilder numerosNaPosicao = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            numerosNaPosicao.append(switch (i) {
                case 3 -> matriz[i][i];
                default -> matriz[i][i] + ", ";
            });
        }
        JOptionPane.showMessageDialog(null, numerosNaPosicao);
    }
}
