package aulas.aula3.exercicios;

import javax.swing.*;

public class Ex1 {

    public static void main(String[] args) {
        do {
            metodoEstatico(JOptionPane.showInputDialog(null, "Digite a mensagem"));
        } while (JOptionPane.showConfirmDialog(null, "Desaja continuar? (S/N)") == 0);
        System.out.println("Saiu do do-while");
    }

    private static void metodoEstatico(Object... parametros){
        for (Object valor : parametros) {
            JOptionPane.showMessageDialog(null,valor + " ");
        }
    }

}
