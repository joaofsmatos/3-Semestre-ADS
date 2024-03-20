package aulas.ados.ado2;

public class Teste {

    static String[] lista = {"N","P","P","P","N","P","N" ,"P" ,"N","P","P","P","N","P","N" ,"P"};

    public static void main(String[] args) {
        while (!acharAlguem()) {
            chamar();
        }
    }

    public static void chamar() {
        int sequenciaP = 0;
        for(int i = 0; i < lista.length; i++) {
            if(lista[i] != null && lista[i].equalsIgnoreCase("P") && sequenciaP < 3) {
                System.out.println(lista[i]);
                lista[i] = null;
                sequenciaP++;
            }
        }
        System.out.println(lista[acharNormal()]);
        lista[acharNormal()] = null;
    }

    public static int acharNormal() {
        for(int i = 0; i < lista.length; i++) {
            if(lista[i] != null && lista[i].equalsIgnoreCase("N")) {
                return i;
            }
        }
        return -1;
    }

    public static boolean acharAlguem() {
        for(int i = 0; i < lista.length; i++) {
            if(lista[i] != null) {
                return false;
            }
        }
        return true;
    }

}
