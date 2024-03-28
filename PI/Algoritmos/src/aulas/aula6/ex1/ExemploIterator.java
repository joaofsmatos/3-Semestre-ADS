package aulas.aula6.ex1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ExemploIterator {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        int indice = 1;
        do {
            nomes.add(JOptionPane.showInputDialog(null, (indice++) + "° nome:"));
        } while (JOptionPane.showInputDialog(null, "Deseja cad outro? (S/N)").equalsIgnoreCase("S"));
        Iterator<String> iterator = nomes.iterator();
        indice = 1;
        while (iterator.hasNext()) {
            System.out.printf("%d° nome => %s\n", (indice++), iterator.next());
        }
    }

}
