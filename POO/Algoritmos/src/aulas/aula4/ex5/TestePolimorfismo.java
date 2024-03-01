package aulas.aula4.ex5;

public class TestePolimorfismo {

    public static void main(String[] args) {
        Animal animal;
        if(args[0].equalsIgnoreCase("cachorro")) animal = new Cachorro();
        else animal = new Gato();
        animal.fala();
    }

}
