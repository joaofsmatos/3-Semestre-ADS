package aulas.aula6.ex2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ServicoAluno {

    ArrayList<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {
        ServicoAluno servicoAluno = new ServicoAluno();
        servicoAluno.menu();
    }

    public void menu() {
        int f = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos alunos?"));
        for (int i = 0; i < f; i++) {
            alunos.add(
                    new Aluno(
                            JOptionPane.showInputDialog(null, "Nome"),
                            Long.parseLong(JOptionPane.showInputDialog(null, "RA"))
                    )
            );
        }
        for(Aluno aluno : alunos) {
            JOptionPane.showMessageDialog(null, aluno);
        }
        JOptionPane.showMessageDialog(null, "Antes de ordenar");
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()) {
            JOptionPane.showMessageDialog(null, iterator.next());
        }
        Collections.sort(alunos);
        JOptionPane.showMessageDialog(null, "Depois de ordenar");
        iterator = alunos.iterator();
        while (iterator.hasNext()) {
            JOptionPane.showMessageDialog(null, iterator.next());
        }
    }

    @Override
    public String toString() {
        return "ServicoAluno{" +
                "alunos=" + alunos +
                '}';
    }

}
