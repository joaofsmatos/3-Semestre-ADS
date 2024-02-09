package aulas.aula1.ex1;

import java.util.Scanner;

public class ServicoPessoa {

    public static void main(String[] args) {
        gerenciarPessoas();
    }

    public static void gerenciarPessoas() {
        Scanner sc = new Scanner(System.in);
        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome(sc.nextLine());
        novaPessoa.setIdade(sc.nextByte());
        sc.nextLine();
        do {
            System.out.println("Desajar continuar andando? S/N");
            if(sc.nextLine().equalsIgnoreCase("S")) {
                novaPessoa.andar();
            } else {
                System.out.println(novaPessoa.toString());
                System.out.println("Deseja alterar usuário? ");
                if (sc.nextLine().equalsIgnoreCase("s")) {
                    System.out.println("Novo nome: ");
                    novaPessoa.setNome(sc.nextLine());
                    System.out.println("Nova idade: ");
                    novaPessoa.setIdade(sc.nextByte());
                }
                System.out.println(novaPessoa.toString());
                return;
            }
        } while (true);
    }

}
