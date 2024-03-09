package aulas.aula4.ex1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ServicoFornecedor {

    private List<Fornecedor> listaFornecedores = new ArrayList<>();

    public void menu() {
        do {
            String tipoFornecedor = JOptionPane.showInputDialog(null, "Tipo fornecedor");
            if(tipoFornecedor.equalsIgnoreCase("Físico")){
                cadastrarFornecedorFisico(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos fornecedores físico?")));
            } else if(tipoFornecedor.equalsIgnoreCase("Empresa")) {
                cadastrarFornecedorEmpresa(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos fornecedores empresa?")));
            } else {
                JOptionPane.showMessageDialog(null, "Tipo fornecedor inválido!");
            }
        } while (JOptionPane.showInputDialog(null, "Desaja cadastrar mais fornecedores? (S/N)").equalsIgnoreCase("s"));
        for(Fornecedor fornecedor : listaFornecedores) {
            JOptionPane.showMessageDialog(null, fornecedor);
        }
    }

    private void cadastrarFornecedorFisico(int i) {
        for (int j = 0; j < i; j++) {
            FornecedorPessoa fornecedorPessoa = new FornecedorPessoa(
                JOptionPane.showInputDialog(null, "RG"),
                JOptionPane.showInputDialog(null, "CPF"),
                JOptionPane.showInputDialog(null, "Nome"),
                JOptionPane.showInputDialog(null, "Fone")
            );
            if(!validarRg(fornecedorPessoa)) {
                JOptionPane.showMessageDialog(null, "RG inválido!");
                i--;
            } else {
                listaFornecedores.add(fornecedorPessoa);
            }
        }
    }

    private void cadastrarFornecedorEmpresa(int i) {
        for (int j = 0; j < i; j++) {
            FornecedorEmpresa fornecedorEmpresa = new FornecedorEmpresa(
                JOptionPane.showInputDialog(null, "Nome"),
                JOptionPane.showInputDialog(null, "Fone"),
                JOptionPane.showInputDialog(null, "IE"),
                JOptionPane.showInputDialog(null, "CNPJ")
            );
            if(!validarCNPJ(fornecedorEmpresa)) {
                JOptionPane.showMessageDialog(null, "CNPJ inválido!");
                i--;
            } else {
                listaFornecedores.add(fornecedorEmpresa);
            }
        }
    }

    private static boolean validarRg(FornecedorPessoa fornecedorPessoa) {
        if(fornecedorPessoa.getRg().length() != 9) return false;
        int soma = 0;
        int digito = Integer.parseInt(String.valueOf(fornecedorPessoa.getRg().charAt(8)));
        for (int i = 0, j = 2; i < fornecedorPessoa.getRg().length() - 1; i++, j++) {
            int numero = Integer.parseInt(String.valueOf(fornecedorPessoa.getRg().charAt(i))) * j;
            soma += numero;
        }
        return  (11 - (soma % 11)) == digito;
    }

    private boolean validarCPF(FornecedorPessoa fornecedorPessoa) {
        if(fornecedorPessoa.getCpf().length() != 11) return false;
        int soma = 0;
        for (int i = 0; i < fornecedorPessoa.getCpf().length() - 2; i++) {
            int numero = Integer.parseInt(String.valueOf(fornecedorPessoa.getCpf().charAt(i))) * (i + 1);
            soma += numero;
        }
        int primeiroDigito = soma % 11;
        soma = 0;
        for (int i = 0; i < fornecedorPessoa.getCpf().length() - 1; i++) {
            int numero = Integer.parseInt(String.valueOf(fornecedorPessoa.getCpf().charAt(i))) * (i);
            soma += numero;
        }
        int segundoDigito = soma % 11;
        return Integer.parseInt(String.valueOf(fornecedorPessoa.getCpf().charAt(fornecedorPessoa.getCpf().length() - 2))) == primeiroDigito
                && Integer.parseInt(String.valueOf(fornecedorPessoa.getCpf().charAt(fornecedorPessoa.getCpf().length() - 1))) == segundoDigito;
    }

    private boolean validarCNPJ(FornecedorEmpresa fornecedorEmpresa) {
        int soma = 0;
        int pD = 0;
        int sD = 0;
        for (int i = 0, j = 6; i < 4; i++, j++) {
            int numero = Integer.parseInt(String.valueOf(fornecedorEmpresa.getCnpj().charAt(i))) * j;
            soma += numero;
        }
        for (int i = 4, j = 2; i < fornecedorEmpresa.getCnpj().length() - 2; i++, j++) {
            int numero = Integer.parseInt(String.valueOf(fornecedorEmpresa.getCnpj().charAt(i))) * j;
            soma += numero;
        }
        pD = soma % 11;
        for (int i = 0, j = 5; i < 5; i++, j++) {
            int numero = Integer.parseInt(String.valueOf(fornecedorEmpresa.getCnpj().charAt(i))) * j;
            soma += numero;
        }
        for (int i = 4, j = 2; i < fornecedorEmpresa.getCnpj().length() - 1; i++, j++) {
            int numero = Integer.parseInt(String.valueOf(fornecedorEmpresa.getCnpj().charAt(i))) * j;
            soma += numero;
        }
        sD = soma % 11;
        System.out.println(pD);
        System.out.println(sD);
        return Integer.parseInt(String.valueOf(fornecedorEmpresa.getCnpj().charAt(fornecedorEmpresa.getCnpj().length() - 2))) == pD
                && Integer.parseInt(String.valueOf(fornecedorEmpresa.getCnpj().charAt(fornecedorEmpresa.getCnpj().length() - 1))) == sD;

    }

}
