package aulas.aula5.ex1;

import static javax.swing.JOptionPane.*;

public class Aplicacao {

    public static void main(String[] args) {
        ServicoConta servicoConta = new ServicoConta();
        do {
            System.out.println(servicoConta.toString());
            int opcao = Integer.parseInt(showInputDialog(null, "1) Criar conta\n2) Depositar\n3) Sacar\n4) Transferir\n5) Sair"));
            switch (opcao) {
                case 1:
                    servicoConta.criarConta(Integer.parseInt(showInputDialog(null, "Número")), showInputDialog(null, "Nome"));
                    break;
                case 2:
                    servicoConta.depositar(servicoConta.acharConta(Integer.parseInt(showInputDialog(null, "Número conta"))));
                    break;
                case 3:
                    servicoConta.sacar(servicoConta.acharConta(Integer.parseInt(showInputDialog(null, "Número conta"))));
                    break;
                case 4:
                    servicoConta.transferir(
                            servicoConta.acharConta(
                                    Integer.parseInt(showInputDialog(null, "Número conta origem"))),
                            servicoConta.acharConta(
                                    Integer.parseInt(showInputDialog(null, "Número conta destino")))
                    );
                    break;
                case 5:
                    return;
                default:
                    showMessageDialog(null, "Opção inválida!");
            }
        } while (true);
    }

}
