package aulas.aula5.ex2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ServicoConta {

    private List<Conta> contas = new ArrayList<>();

    public void criarConta(int numero, String nome) {
        contas.add(new Conta(numero, nome));
    }

    public Conta acharConta(int numero) {
        for (Conta conta : contas) {
            if(conta.getNumero() == numero) return conta;
        }
        return null;
    }

    public void sacar(Conta conta) {
        JOptionPane.showMessageDialog(null,
                conta.sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor saque"))) ? "OK!" : "ERRO!"
        );
    }

    public void depositar(Conta conta) {
        JOptionPane.showMessageDialog(null,
                conta.depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor depósito"))) ? "OK!" : "ERRO!"
        );
    }

    public void transferir(Conta contaOrigem, Conta contaDestino) {
        contaOrigem = acharConta(Integer.parseInt(JOptionPane.showInputDialog(null, "Número conta origem")));
        contaDestino = acharConta(Integer.parseInt(JOptionPane.showInputDialog(null, "Número conta destino")));
        if(contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(contaOrigem, contaDestino, Double.parseDouble(JOptionPane.showInputDialog(null, "Valor")));
        } else {
            if(contaOrigem == null) JOptionPane.showMessageDialog(null, "Conta origem inexistente!");
            if(contaDestino == null) JOptionPane.showMessageDialog(null, "Conta destino inexistente!");
        }
    }


}
