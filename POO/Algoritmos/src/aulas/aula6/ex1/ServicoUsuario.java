package aulas.aula6.ex1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ServicoUsuario {

    private List<Usuario> usuarios = new ArrayList<>();

    private void cadastrarUsuario() {
        int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de usuário que deseja cadastrar?"));
        for (int i = 0; i < qtd; i++) {
            usuarios.add(new Usuario(JOptionPane.showInputDialog(null, "Nome do novo usuário")));
        }
    }

    private Usuario detalharUsuario(int posicao) throws Exception {
        if(posicao == -1) {
            throw new Exception("Não encontrado!");
        } else {
            return usuarios.get(posicao);
        }
    }

    private int pesquisarUsuario(int posicao) {
        if(posicao >= 0 && posicao < usuarios.size())
            return posicao - 1;
        else
            return -1;
    }

    private int pesquisarUsuario(String nome) {
        for (int i = 0; i < this.usuarios.size(); i++) {
            if(this.usuarios.get(i).getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }

    private boolean deletarUsuario(String nome) {
        if(pesquisarUsuario(nome) == -1) return false;
        usuarios.remove(pesquisarUsuario(nome));
        return true;
    }

    private boolean deletarUsuario(int posicao) {
        if(pesquisarUsuario(posicao) == -1) return false;
        usuarios.remove(pesquisarUsuario(posicao));
        return true;
    }

    public void menu() {
        try {
            do {
                int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Cadastrar novo usuário\n2) Pesquisar nome usuário\n3) Pesquisar posição usuário\n4) Deletar usuário por nome\n5) Deletar usuário por posição\n6) Listar usuários\n7) Sair"));
                switch (opcao) {
                    case 1:
                        cadastrarUsuario();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,
                                detalharUsuario(
                                    pesquisarUsuario(JOptionPane.showInputDialog(null, "Nome do usuário"))
                                )
                        );
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,
                                detalharUsuario(
                                    pesquisarUsuario(Integer.parseInt(JOptionPane.showInputDialog(null, "Posição do usuário")))
                                )
                        );
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,
                                deletarUsuario(JOptionPane.showInputDialog(null, "Nome do usuário")) ? "Deletado!" : "Não encontrado!"
                        );
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,
                                deletarUsuario(Integer.parseInt(JOptionPane.showInputDialog(null, "Posição do usuário"))) ? "Deletado!" : "Não encontrado!"
                        );
                        break;
                    case 6:
                        System.out.println(usuarios);
                        break;
                    case 7:
                        return;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            } while (true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            menu();
        }
    }

    @Override
    public String toString() {
        return "ServicoUsuario{" +
                "usuarios=" + usuarios +
                '}';
    }

}
