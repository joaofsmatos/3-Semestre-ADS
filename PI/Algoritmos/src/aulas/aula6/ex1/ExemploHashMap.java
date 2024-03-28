package aulas.aula6.ex1;

import javax.swing.*;
import java.util.HashMap;
import java.util.Set;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> nomes = new HashMap<>();
        do {
            nomes.put(JOptionPane.showInputDialog(null, "CPF", "Novo CPF", -1), JOptionPane.showInputDialog(null, "Nome:", "Novo nome", -1));
        } while (JOptionPane.showConfirmDialog(null, "Deseja cad outro?", "Opção", 0) == 0);
        do {
            int i = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Deletar\n2) Detalhar\n3) Listar\n4) Sair"));
            switch (i) {
                case 1:
                    removerPessoa(JOptionPane.showInputDialog(null, "CPF:", "Remover", -1), nomes);
                    break;
                case 2:
                    imprimirPessoa(nomes, JOptionPane.showInputDialog(null, "CPF", "Detalhes", -1));
                    break;
                case 3:
                    imprimirPessoas(nomes);
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

    private static void imprimirPessoas(HashMap<String, String> nomes) {
        Set<String> chaves = nomes.keySet();
        for (String chave : chaves) {
            JOptionPane.showMessageDialog(null, nomes.get(chave));
        }
    }

    private static void imprimirPessoa(HashMap<String, String> nomes, String cpf) {
        if(nomes.get(cpf) != null) {
            JOptionPane.showMessageDialog(null, nomes.get(cpf), "Imprimir", -1);
        } else {
            JOptionPane.showMessageDialog(null, "Não encontrado!", "Erro", -1);
        }
    }

    private static void removerPessoa(String cpf, HashMap<String, String> nomes) {
        if(!cpf.isEmpty() && nomes.get(cpf) != null) {
            imprimirPessoa(nomes, cpf);
            nomes.remove(cpf);
        }
    }

}
