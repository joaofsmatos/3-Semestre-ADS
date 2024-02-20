package ados.ado1;

import javax.swing.*;

public class Matriz {

    public int[][] criarMatriz(int ordem) {
        return new int[ordem][ordem];
    }

    public void preencherMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da coluna " + j + " da linha " + i));
            }
        }
    }

}
