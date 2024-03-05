package aulas.aula4.heranca;

public class Pessoa {

    public static void main(String[] args) {
        printL("Olá mundo! Hoje estou programando um vetor em do tipo Object, que printa n parâmetros...", "Nasci em 2004", (2.2f - 2), 2.3, !true, "ola");
    }

    public static void printL(Object... o) {
        StringBuilder parametros = new StringBuilder();
        for (Object objeto : o) {
            parametros.append(objeto).append("\n");
        }
        System.out.println(parametros);
    }

}
