package aulas.ados.ado2.source;

import javax.swing.*;

public class ServicoPaciente {

    private Paciente[] pacientes = new Paciente[6];
    private int tamanho = 0;
    private int senha = 1;
    private int sequenciaP = 0;

    public static void main(String[] args) throws Exception {
        ServicoPaciente servicoPaciente = new ServicoPaciente();
        servicoPaciente.inserirPaciente("João", "P");
        servicoPaciente.inserirPaciente("Maria", "P");
        servicoPaciente.inserirPaciente("Nelson", "P");
        servicoPaciente.inserirPaciente("Lindalva", "P");
        servicoPaciente.inserirPaciente("Mario", "N");
        while (true) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Entrar \n2) Atualizar\n3) Tamanho\n4) Sair"));
            switch (opcao) {
                case 1:
                    servicoPaciente.inserirPaciente(JOptionPane.showInputDialog(null, "Nome"), JOptionPane.showInputDialog(null, "N) Normal\nP) Preferencial").toUpperCase());
                    break;
                case 2:
                    if(servicoPaciente.pacientes.length > 0) {
                        servicoPaciente.chamarPaciente();
                    } else {
                        JOptionPane.showMessageDialog(null, "A fila está vazia!");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "A fila possui " + servicoPaciente.tamanho + " pacientes");
                    break;
                case 4:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private void inserirPaciente(String nome, String senha) throws Exception {
        if(this.tamanho == this.pacientes.length) {
            aumentarFila();
        }
        if (this.tamanho < this.pacientes.length) {
            this.pacientes[tamanho] = new Paciente(nome, senha);
            this.tamanho++;
        } else {
            throw new Exception("Erro ao inserir na fila!");
        }
    }

    private void chamarPaciente() {
        for(int i = 0; i < this.tamanho; i++) {
            if(this.pacientes[i] != null && this.pacientes[i].getTipo().equalsIgnoreCase("P") && sequenciaP < 3) {
                System.out.println(pacientes[i].getNome() + " " + this.senha + pacientes[i].getTipo());
                this.pacientes[i] = null;
                sequenciaP++;
                this.senha++;
                reorganizarFila();
                diminuirVagasVazia();
                break;
            }
        }
        if(acharNormal() != -1 && sequenciaP == 3 || acharPreferencial() == -1 && acharNormal() != -1) {
            System.out.println(this.pacientes[acharNormal()].getNome() + " " + this.senha + pacientes[acharNormal()].getTipo());
            this.pacientes[acharNormal()] = null;
            this.senha++;
            sequenciaP = 0;
            reorganizarFila();
            diminuirVagasVazia();
        }
    }

    private int acharPreferencial() {
        for(int i = 0; i < this.tamanho; i++) {
            if(this.pacientes[i] != null && this.pacientes[i].getTipo().equalsIgnoreCase("P")) {
                return i;
            }
        }
        return -1;
    }

    public int acharNormal() {
        for(int i = 0; i < this.tamanho; i++) {
            if(this.pacientes[i] != null && this.pacientes[i].getTipo().equalsIgnoreCase("N")) {
                return i;
            }
        }
        return -1;
    }

    private void aumentarFila() {
        Paciente[] filaMaior = new Paciente[this.pacientes.length + 1];
        System.arraycopy(this.pacientes, 0, filaMaior, 0, this.pacientes.length);
        this.pacientes = filaMaior;
    }

    private void reorganizarFila() {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.pacientes[i] == null) {
                for (int j = i + 1; j < this.tamanho; j++) {
                    if (this.pacientes[j] != null) {
                        this.pacientes[i] = this.pacientes[j];
                        this.pacientes[j] = null;
                        break;
                    }
                }
            }
        }
    }

    private void diminuirVagasVazia() {
        int qtdVagaVazia = 0;
        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.pacientes[i] == null) {
                qtdVagaVazia++;
            }
        }
        Paciente[] filaSemVagaVazia = new Paciente[this.tamanho - qtdVagaVazia];
        for (int i = 0; i < filaSemVagaVazia.length; i++) {
            if (this.pacientes[i] != null) {
                filaSemVagaVazia[i] = this.pacientes[i];
            }
        }
        this.pacientes = filaSemVagaVazia;
        this.tamanho = filaSemVagaVazia.length;
    }

}
