package aulas.projetos.projeto1;

import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho: ")));
        try {
            int i = 1;
            do {
                if(vetor.getElementos()[vetor.getTamanhoVetor() - 1] != null && vetor.getTamanhoVetor() == vetor.getTamanho()) {
                    vetor.aumentarCapacidade();
                }
                vetor.adicionar(JOptionPane.showInputDialog("Elemento " + i++ + "° "));
            } while (JOptionPane.showConfirmDialog(null, "Deseja adicionar um novo elemento?") == 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "A lista possuí " + vetor.getTamanho() + " valor(es) adicionados!");
        JOptionPane.showMessageDialog(null, vetor.toString());
        try {
            do {
                JOptionPane.showMessageDialog(null, vetor.buscarPorPosicao(
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a posição"))));
            } while (JOptionPane.showConfirmDialog(null, "Deseja busca um novo elemento por posição?") == 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        do {
            String existe = vetor.buscarPorValor(
                    JOptionPane.showInputDialog(null, "Informe o valor")) == -1 ? "Não existe!" : "Existe!";
            JOptionPane.showMessageDialog(null, existe);
        } while (JOptionPane.showConfirmDialog(null, "Deseja busca um novo elemento por valor?") == 0);
        try {
            do {
                vetor.adicionarNoInicio(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a posicao para adicionar no vetor")),
                        JOptionPane.showInputDialog(null, "Informe o valor para adicionar no vetor"));
            } while (JOptionPane.showConfirmDialog(null, "Deseja adicionar um novo elemento por posição e valor?") == 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "A lista possuí " + vetor.getTamanho() + " valor(es) adicionados!");
        JOptionPane.showMessageDialog(null, vetor.toString());
        try {
            do {
                vetor.removerElemento(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a posicao para remover")));
            } while (JOptionPane.showConfirmDialog(null, "Deseja remover um novo elemento por posição?") == 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "A lista possuí " + vetor.getTamanho() + " valor(es) adicionados!");
        JOptionPane.showMessageDialog(null, vetor.toString());
    }
}
