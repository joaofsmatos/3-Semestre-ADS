package aulas.projetos;

public class Ex1 {

    public static void main(String[] args) {
        for (int i = 1, inicio = 1, fim = 9; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if(i == (inicio + fim) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
        }
    }

              *
             ***
            *****
           *******
          *********
           *******
            *****
             ***
              *


}
