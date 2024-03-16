package aulas.aula5.ex1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class ServicoConta {

    private List<Conta> contas = new ArrayList<>();

    public void criarConta(int numero, String nome) {
        contas.add(new Conta(numero, nome));
    }

    public Conta acharConta(int numero) throws Exception {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) return conta;
        }
        throw new Exception("Conta inválida!");
    }

    public void sacar(Conta conta) throws Exception {
        JOptionPane.showMessageDialog(null,
                conta.sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor saque"))) ? "Sacado!" : "Saldo insuficiente!"
        );
    }

    public void depositar(Conta conta) throws Exception {
        JOptionPane.showMessageDialog(null,
                conta.depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor depósito"))) ? "Depositado!" : "Valor menor ou igual a zero!"
        );
    }

    public void transferir(Conta contaOrigem, Conta contaDestino) throws Exception {
        if (contaOrigem != null && contaDestino != null) {
            JOptionPane.showMessageDialog(null,
                    contaOrigem.transferir(contaOrigem, contaDestino, Double.parseDouble(JOptionPane.showInputDialog(null, "Valor"))) ? "Transferido!" : "ERRO!"
            );
        } else {
            throw new Exception("A conta origem não pode ser a mesma que a destino!");
        }
        if (contaOrigem == null) JOptionPane.showMessageDialog(null, "Conta origem inexistente!");
        if (contaDestino == null) JOptionPane.showMessageDialog(null, "Conta destino inexistente!");
    }

    public void pagarConta(Conta conta, String codigoDeBarras) throws Exception {
        double valorContaAhPagar = verificarCodigoDeBarras(codigoDeBarras);
        if (valorContaAhPagar <= conta.getSaldo() + conta.getLimite()) {
            JOptionPane.showMessageDialog(null, "Valor da conta: " + valorContaAhPagar);
            JOptionPane.showMessageDialog(null, "Saldo anteterior: " + conta.getSaldo());
            conta.sacar(valorContaAhPagar);
            JOptionPane.showMessageDialog(null, "Conta paga!");
            JOptionPane.showMessageDialog(null, "Saldo atual: " + conta.getSaldo());
        } else {
            throw new Exception("Saldo insuficiente!");
        }
    }

    private double verificarCodigoDeBarras(String codigoDeBarras) throws Exception {
        Random rdm = new Random();
        if (codigoDeBarras.length() == 3) {
            return rdm.nextDouble(100.2f);
        }
        throw new Exception("Código de barras inválido!");
    }

    public void menu() {
        try {
            do {
                System.out.println(toString());
                int opcao = Integer.parseInt(showInputDialog(null, "1) Criar conta\n2) Depositar\n3) Sacar\n4) Transferir\n5) Pagar conta\n6) Sair"));
                switch (opcao) {
                    case 1:
                        criarConta(Integer.parseInt(showInputDialog(null, "Número")), showInputDialog(null, "Nome"));
                        break;
                    case 2:
                        depositar(acharConta(Integer.parseInt(showInputDialog(null, "Número conta"))));
                        break;
                    case 3:
                        sacar(acharConta(Integer.parseInt(showInputDialog(null, "Número conta"))));
                        break;
                    case 4:
                        transferir(
                                acharConta(
                                        Integer.parseInt(showInputDialog(null, "Número conta origem"))),
                                acharConta(
                                        Integer.parseInt(showInputDialog(null, "Número conta destino")))
                        );
                        break;
                    case 5:
                        pagarConta(
                                acharConta(Integer.parseInt(showInputDialog(null, "Número conta"))),
                                JOptionPane.showInputDialog(null, "Código de barras")
                        );
                        break;
                    case 6:
                        return;
                    default:
                        showMessageDialog(null, "Opção inválida!");
                }
            } while (true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            menu();
        }
    }

    @Override
    public String toString() {
        return "ServicoConta{" +
                "contas=" + contas +
                '}';
    }

}
