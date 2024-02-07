package aulas.aula2;

import java.util.Scanner;

public class VetorOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[10];
        String[] dadosCliente = new String[4];
        for (int i = 0; i < clientes.length; i++) {
            for (int j = 0; j < dadosCliente.length; j++) {
                dadosCliente[j] = sc.nextLine();
            }
            Cliente novoCliente = new Cliente(dadosCliente[0],dadosCliente[1],dadosCliente[2],dadosCliente[3].charAt(0));
            clientes[i] = novoCliente;
        }
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

}
