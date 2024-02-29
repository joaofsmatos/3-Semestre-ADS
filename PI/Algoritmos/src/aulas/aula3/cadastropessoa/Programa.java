package aulas.aula3.cadastropessoa;

import javax.swing.*;

public class Programa {

    public static void main(String[] args) {
        ServicoPessoa servicoPessoa = new ServicoPessoa();
        servicoPessoa.criarHomem();
        JOptionPane.showMessageDialog(null, servicoPessoa.pessoa.sexo);
        servicoPessoa.criarMulher();
        JOptionPane.showMessageDialog(null, servicoPessoa.pessoa.sexo);
    }

}
