package aulas.aula3.ex1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ServicoUsuario {

    List<Usuario> usuarios = new ArrayList<Usuario>();

    public Usuario criarUsuario(String nome, String senha) {
        return new Usuario(nome, senha);
    }

    public boolean validarUsuario(String nome, String senha) {
        for (Usuario usuario:usuarios){
            if(usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void imprimirListaUsuarios(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Usuario usuario : usuarios) {
            stringBuilder.append(usuario);
        }
        JOptionPane.showMessageDialog(null, "Usuários:" + stringBuilder);
    }

    public void sistemaMain(){
        do {
            adicionarUsuario(criarUsuario(JOptionPane.showInputDialog(null, "Digite nome:"),
                    JOptionPane.showInputDialog(null, "Digite senha:")));
        } while (JOptionPane.showInputDialog(null, "Deseja cadastrar um novo usuário? (S/N)").equalsIgnoreCase("S"));
        boolean existe;
        do {
            existe = validarUsuario(JOptionPane.showInputDialog("Login"), JOptionPane.showInputDialog("Password"));
            if(existe) JOptionPane.showMessageDialog(null, "Bem-vindo!");
            else JOptionPane.showMessageDialog(null, "Dados inválidos!");
        } while (!existe);
        imprimirListaUsuarios();
    }

}
