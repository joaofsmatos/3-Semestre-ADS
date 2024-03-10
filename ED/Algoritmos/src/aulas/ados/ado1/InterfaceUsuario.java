package aulas.ados.ado1;

import javax.swing.*;

public class InterfaceUsuario {

    static ServicoPersonagem servicoPersonagem = new ServicoPersonagem();

    public void menuOpcoes() {
        inserirParaTeste();
        do {
            String opcao = JOptionPane.showInputDialog(null, "1) Inserir\n2) Deletar\n3) Pesquisar\n4) Editar\n5) Listar Ranking\n6) Sair", "Ranking de Personagens", JOptionPane.PLAIN_MESSAGE);
            if (!opcao.equalsIgnoreCase("1") && servicoPersonagem.getTamanho() == 0 && !opcao.equalsIgnoreCase("6")) {
                JOptionPane.showMessageDialog(null, "Lista vazia!", "ERRO!", JOptionPane.PLAIN_MESSAGE);
                menuOpcoes();
            }
            switch (opcao) {
                case "1":
                    inserir();
                    break;
                case "2":
                    deletar();
                    break;
                case "3":
                    pesquisar();
                    break;
                case "4":
                    editar();
                    break;
                case "5":
                    servicoPersonagem.imprimirRanking();
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "ERRO!", JOptionPane.PLAIN_MESSAGE);
                    menuOpcoes();
                    break;
            }
        } while (true);
    }

    public void inserir() {
        do {
            switch (JOptionPane.showInputDialog(null, "1) Inserir novo personagem\n2) Inserir novo personagem por posição\n3) Voltar", "Inserir novo personagem", JOptionPane.PLAIN_MESSAGE)) {
                case "1":
                    servicoPersonagem.criarPersonagem(
                            JOptionPane.showInputDialog(null, "Nome", "Dados novo personagem", JOptionPane.PLAIN_MESSAGE),
                            JOptionPane.showInputDialog(null, "Anime", "Dados novo personagem", JOptionPane.PLAIN_MESSAGE),
                            JOptionPane.showInputDialog(null, "Poder", "Dados novo personagem", JOptionPane.PLAIN_MESSAGE),
                            JOptionPane.showInputDialog(null, "Sexo", "Dados novo personagem", JOptionPane.PLAIN_MESSAGE)
                    );
                    break;
                case "2":
                    System.out.println("n implementado");
                    break;
                case "3":
                    menuOpcoes();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "ERRO!", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
        } while (true);
    }

    public void deletar() {
        do {
            switch (JOptionPane.showInputDialog(null, "1) Deletar e inserir novo personagem\n2) Deletar por posição\n3) Deletar por nome\n4) Voltar", "Deletar personagem", JOptionPane.PLAIN_MESSAGE)) {
                case "1":
                    if (servicoPersonagem.deletarPersonagem(
                            new Personagem(
                                    JOptionPane.showInputDialog(null, "Nome", "Dados novo personagem", JOptionPane.PLAIN_MESSAGE),
                                    JOptionPane.showInputDialog(null, "Anime", "Dados novo personagem", JOptionPane.PLAIN_MESSAGE),
                                    JOptionPane.showInputDialog(null, "Poder", "Dados novo personagem", JOptionPane.PLAIN_MESSAGE),
                                    JOptionPane.showInputDialog(null, "Sexo", "Dados novo personagem", JOptionPane.PLAIN_MESSAGE)
                            ), Integer.parseInt(JOptionPane.showInputDialog(null, "Posição", "Dados novo personagem", JOptionPane.PLAIN_MESSAGE)))
                    ) {
                        JOptionPane.showMessageDialog(null, "OK!", "Status", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Posição inválida!", "Status", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "2":
                    if (servicoPersonagem.deletarPersonagem(Integer.parseInt(JOptionPane.showInputDialog(null, "Posição", "Deletar personagem", JOptionPane.PLAIN_MESSAGE)))) {
                        JOptionPane.showMessageDialog(null, "OK!", "Status", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Posição inválida!", "Status", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "3":
                    if (servicoPersonagem.deletarPersonagem(JOptionPane.showInputDialog(null, "Nome", "Deletar personagem", JOptionPane.PLAIN_MESSAGE))) {
                        JOptionPane.showMessageDialog(null, "OK!", "Status", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Personagem não encontrado!", "Status", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "4":
                    menuOpcoes();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Status", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
        } while (true);
    }

    public void pesquisar() {
        do {
            switch (JOptionPane.showInputDialog(null, "1) Pesquisar por nome\n2) Pesquisar por anime\n3) Pesquisar por poder\n4) Pesquisar por sexo\n5) Voltar", "Pesquisar personagem", JOptionPane.PLAIN_MESSAGE)) {
                case "1":
                    servicoPersonagem.pesquisarPersonagem(JOptionPane.showInputDialog(null, "Nome do personagem", "Dados personagem", JOptionPane.PLAIN_MESSAGE), 1);
                    break;
                case "2":
                    servicoPersonagem.pesquisarPersonagem(JOptionPane.showInputDialog(null, "Anime dos personagens", "Dados personagem", JOptionPane.PLAIN_MESSAGE), 2);
                    break;
                case "3":
                    servicoPersonagem.pesquisarPersonagem(JOptionPane.showInputDialog(null, "Poder dos personagens", "Dados personagem", JOptionPane.PLAIN_MESSAGE), 3);
                    break;
                case "4":
                    servicoPersonagem.pesquisarPersonagem(JOptionPane.showInputDialog(null, "Sexo dos personagens", "Dados personagem", JOptionPane.PLAIN_MESSAGE), 4);
                    break;
                case "5":
                    menuOpcoes();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Status", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
        } while (true);
    }

    public void editar() {
        do {
            switch (JOptionPane.showInputDialog(null, "1) Editar nome\n2) Editar anime\n3) Editar poder\n4) Editar sexo\n5) Editar personagem\n6) Voltar", "Editar personagem", JOptionPane.PLAIN_MESSAGE)) {
                case "1":
                    if (servicoPersonagem.editarPersonagem(JOptionPane.showInputDialog(null,"Nome do personagem", "Dados personagem", JOptionPane.PLAIN_MESSAGE), 1)) {
                        JOptionPane.showMessageDialog(null, "OK!", "Status", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "ERRO!", "Status", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "2":
                    if (servicoPersonagem.editarPersonagem(JOptionPane.showInputDialog(null, "Nome do personagem", "Dados personagem", JOptionPane.PLAIN_MESSAGE), 2)) {
                        JOptionPane.showMessageDialog(null, "OK!", "Status", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Personagem não encontrado!", "Status", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "3":
                    if (servicoPersonagem.editarPersonagem(JOptionPane.showInputDialog(null,"Nome do personagem", "Dados personagem", JOptionPane.PLAIN_MESSAGE), 3)) {
                        JOptionPane.showMessageDialog(null, "OK!", "Status", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Personagem não encontrado!", "Status", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "4":
                    if (servicoPersonagem.editarPersonagem(JOptionPane.showInputDialog(null, "Nome do personagem", "Dados personagem", JOptionPane.PLAIN_MESSAGE), 4)) {
                        JOptionPane.showMessageDialog(null, "OK!", "Status", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Personagem não encontrado!", "Status", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "5":
                    if (servicoPersonagem.editarPersonagem(JOptionPane.showInputDialog(null,"Nome do personagem", "Dados personagem", JOptionPane.PLAIN_MESSAGE), 5)) {
                        JOptionPane.showMessageDialog(null, "OK!", "Status", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Personagem não encontrado!", "Status", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "6":
                    menuOpcoes();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Status", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
        } while (true);
    }

    public void inserirParaTeste() {
        servicoPersonagem.criarPersonagem("Naruto", "Naruto", "100", "Masculino");
        servicoPersonagem.criarPersonagem("Sasuke", "Naruto", "100", "Masculino");
        servicoPersonagem.criarPersonagem("Sakura", "Naruto", "100", "Feminino");
        servicoPersonagem.criarPersonagem("Choj", "Naruto", "100", "Masculino");
        servicoPersonagem.criarPersonagem("Kakashi", "Naruto", "100", "Masculino");
        servicoPersonagem.criarPersonagem("Rick", "Rick and Morty", "100", "Masculino");
        servicoPersonagem.criarPersonagem("Morty", "Rick and Morty", "100", "Masculino");
        servicoPersonagem.criarPersonagem("Irma", "Rick and Morty", "100", "Feminino");
    }

}
