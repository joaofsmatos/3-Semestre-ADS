package aulas.aula6.ex1;

import javax.swing.*;
import java.util.HashSet;
import java.util.Iterator;

public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        int indice = 1;
        do {
            nomes.add(JOptionPane.showInputDialog(null, (indice++) + "° nome:", "Novo nome", -1));
        } while (JOptionPane.showConfirmDialog(null, "Deseja cad outro?", "Opção", 0) == 0);
        Iterator<String> iterator = nomes.iterator();
        indice = 1;
        while (iterator.hasNext()) {
            System.out.printf("%d° nome => %s\n", (indice++), iterator.next());
        }
    }
}
