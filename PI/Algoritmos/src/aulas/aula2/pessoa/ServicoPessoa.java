package aulas.aula2.pessoa;

import javax.swing.*;

public class ServicoPessoa {

    private void cadPessoa(){
        Pessoa p = new Pessoa(
                JOptionPane.showInputDialog(null, "Digite seu nome"),
                Byte.parseByte(JOptionPane.showInputDialog(null, "Digite sua idade")),
                JOptionPane.showInputDialog(null, "Digite seu endereço")
        );
        JOptionPane.showMessageDialog(null, p.toString());
        p.setNome(JOptionPane.showInputDialog(null, "Nome antigo ( " + p.getNome() + " ) novo nome: "));
        p.setIdade(Byte.parseByte(JOptionPane.showInputDialog(null, "Idade antiga ( " + p.getIdade() + " ) nova idade: ")));
        p.setEndereco(JOptionPane.showInputDialog(null, "Endereço antigo ( " + p.getEndereco() + " ) novo endereço: "));
        JOptionPane.showMessageDialog(null, p.toString());
    }

    public void menu(){
        do {
            cadPessoa();
        } while(JOptionPane.showInputDialog(null, "Deseja continuar? (S/N)").equalsIgnoreCase("S"));
    }

}
