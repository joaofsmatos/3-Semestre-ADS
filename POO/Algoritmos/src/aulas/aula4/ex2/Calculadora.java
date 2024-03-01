package aulas.aula4.ex2;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return this.somar(a, b) + c;
    }

    public float somar(float a, float b) {
        return a + b;
    }

    public long somar(int... numeros) {
        long resultado = 0;
        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

}
