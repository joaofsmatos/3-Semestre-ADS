package aulas.aula4.ex2;

import javax.swing.*;

public class TestarCalculadora extends Calculadora{

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        JOptionPane.showMessageDialog(null, calculadora.somar(1,2));
        JOptionPane.showMessageDialog(null, calculadora.somar(1,2,3));
        JOptionPane.showMessageDialog(null, calculadora.somar(1.2f, 3.5f));
        JOptionPane.showMessageDialog(null, calculadora.somar(1, 2, 4, 5, 6));
    }

}
